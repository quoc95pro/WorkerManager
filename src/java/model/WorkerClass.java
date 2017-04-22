/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.RentalContract;
import entity.workerrentalcontract;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DataProcess;

/**
 *
 * @author Administrator
 */
public class WorkerClass {
    public boolean checkLogin(String workerID,String passWord){
        boolean result = false;
        String sql="Select * from worker where WorkerID=? and PassWord=?";
        try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            prst.setString(1, workerID);
            prst.setString(2, passWord);
            
            ResultSet rs = prst.executeQuery();
            result = rs.next();
            rs.close();
            prst.close();
        } catch (SQLException e) {
            Logger.getLogger(AdminClass.class.getName()).log(Level.SEVERE,null, e);
        }
       
        return result;
    }
    
    
    
    public ArrayList<RentalContract> workList(String workerID){
       String sql = "SELECT rentalcontract.RentalContractID,rentalcontract.UserName,rentalcontract.place,rentalcontract.JobDescription,rentalcontract.AdminID,"
               + "rentalcontract.Price,rentalcontract.StartTime,rentalcontract.EndTime,workerrentalcontract.Status FROM `rentalcontract`,`worker`,`workerrentalcontract` "
               + "WHERE worker.WorkerID=workerrentalcontract.WorkerID and rentalcontract.RentalContractID=workerrentalcontract.RentalContractID and worker.WorkerID=?";
       ArrayList<RentalContract> lst = new ArrayList<>();
       
        try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            prst.setString(1, workerID);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {                
                RentalContract rc = new RentalContract();
                rc.setRentalContractID(rs.getString(1));
                rc.setUserName(rs.getString(2));
                rc.setPlace(rs.getString(3));
                rc.setJobDescription(rs.getString(4));
                rc.setAdminID(rs.getString(5));
                rc.setPrice(rs.getFloat(6));
                rc.setStartTime(rs.getString(7));
                rc.setEndTime(rs.getString(8));
                rc.setStatus(rs.getString(9));
                lst.add(rc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return lst;
    }
    
    
    public String GetStartTime(String rc){
       String sql = "SELECT StartTime FROM rentalcontract where RentalContractID=?";
     try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            prst.setString(1, rc);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {                
               return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return null;
    }
    
    public int SoNgayLamViec(String rc){
         int day;
         Date today=new Date(System.currentTimeMillis());
         SimpleDateFormat timeFormat= new SimpleDateFormat("dd/MM/yyyy");
         String trc = GetStartTime(rc);
         String sau = timeFormat.format(today.getTime());
        
         String[] lst = trc.split("/");
        String[] lst2 = sau.split("/");
        
        int daytr = Integer.parseInt(lst[0]);
        int monthtr = Integer.parseInt(lst[1]);
        int yeartr = Integer.parseInt(lst[2]);
        
        int daysau = Integer.parseInt(lst2[0]);
        int monthsau = Integer.parseInt(lst2[1]);
        int yearsau = Integer.parseInt(lst2[2]);
        
        if(yeartr==yearsau){
            if(daysau<daytr){
                day = (monthsau-monthtr-1)*30+daysau+30-daytr;
            }else{
                day = (monthsau-monthtr)*30+daysau-daytr;
            }
        }else{
            int month;
            if(monthsau<monthtr){
                month = monthsau+12-monthtr;
                if(daysau<daytr){
                day = (month-1)*30+daysau+30-daytr;
            }else{
                day = (month)*30+daysau-daytr;
            }
            }else{
                 if(daysau<daytr){
                day = (monthsau+12-monthtr-1)*30+daysau+30-daytr;
            }else{
                day = (monthsau+12-monthtr)*30+daysau-daytr;
            }
            }
        }
        return day;
    }
    
    public boolean updateSoNgayLamViec(String rc,String wid){
        int result = 0;
        String sql="UPDATE workerrentalcontract SET Days="+SoNgayLamViec(rc)+",Status='done' where RentalContractID='"+rc+"' and WorkerID='"+wid+"'";
        String sql2="UPDATE worker SET Status='free' where WorkerID='"+wid+"'";
        try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            result +=  prst.executeUpdate();
           
            prst = DataProcess.getConnection().prepareStatement(sql2);
            result +=  prst.executeUpdate();
            prst.close();
        } catch (SQLException e) {
            Logger.getLogger(AdminClass.class.getName()).log(Level.SEVERE,null, e);
        }
       
        return result>1;
    }

    public void TinhTien(String rc){
         String sql = "SELECT * FROM workerrentalcontract where RentalContractID=?";
         ArrayList<workerrentalcontract> lst = new ArrayList<>();
     try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            prst.setString(1, rc);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {                
               workerrentalcontract wrc = new workerrentalcontract(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
               lst.add(wrc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     int cont=0;
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).getStatus().equals("working")){
                cont=1;
            }
        }
        
        if(cont==0){
            float tong = 0;
            for (int i = 0; i < lst.size(); i++) {
                tong += lst.get(i).getDays()*getPricePerDay(lst.get(i).getWorkerID());
                 
            }
              Date day=new Date(System.currentTimeMillis());
              SimpleDateFormat timeFormat= new SimpleDateFormat("dd/MM/yyyy");
               String today = timeFormat.format(day.getTime());
            String sqlx="UPDATE rentalcontract SET Price=?,status='done',EndTime=? where RentalContractID='"+rc+"'";
             try {
                 
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sqlx);
            prst.setFloat(1, tong);
            prst.setString(2, today);
            prst.executeUpdate();
            prst.close();
        } catch (SQLException e) {
            Logger.getLogger(AdminClass.class.getName()).log(Level.SEVERE,null, e);
        }
        }
    }
    
    public float getPricePerDay(String wid){
        String sql = "SELECT PricePerDay FROM worker where WorkerID=?";
     
     try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            prst.setString(1, wid);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {                
               return rs.getFloat(1);
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
     return 0;
    }
    
    
}
