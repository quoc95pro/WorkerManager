/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.RentalContract;
import entity.Work;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quoc95
 */
public class WorkClass {
    public ArrayList<Work> WorkList(){
    String sql = "SELECT * FROM `Work`";
       ArrayList<Work> lst = new ArrayList<>();
       
        try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {                
                Work w = new Work();
                w.setId(rs.getInt(1));
                w.setName(rs.getString(2));
                w.setDescription(rs.getString(3));
                w.setLink(rs.getString(4));
                lst.add(w);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return lst;
    }
    
    public Work WorkByID(int id){
    String sql = "SELECT * FROM `Work` where id = "+id+"";
       Work lst = new Work();
       
        try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {                
               
                lst.setId(rs.getInt(1));
                lst.setName(rs.getString(2));
                lst.setDescription(rs.getString(3));
                lst.setLink(rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return lst;
    }
}
