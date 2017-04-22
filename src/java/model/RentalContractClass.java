/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.RentalContract;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DataProcess;

/**
 *
 * @author SonCR
 */
public class RentalContractClass {
     public boolean addContract(String userName,String place,String jobDescription,int numberOfWorker,String startTime){
       int result = 0;
        String sql="INSERT INTO rentalcontract(RentalContractID,UserName,place,JobDescription,NumberOfWorker,StartTime,Status) VALUES(?,?,?,?,?,?,?)";
        
        
        try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            prst.setString(1, NextID());
            prst.setString(2, userName);
            prst.setString(3, place);
            prst.setString(4, jobDescription);
            prst.setInt(5, numberOfWorker);
            prst.setString(6, startTime);
            prst.setString(7, "pending");
            result=prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(RentalContractClass.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return result>0;
    }
     
     public String GetLastID()
{
            String sql = "SELECT RentalContractID FROM `rentalcontract` ORDER by RentalContractID DESC LIMIT 1";
         try {
             PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
             ResultSet rs = prst.executeQuery();
             while (rs.next()) {                 
                 return rs.getString(1);
             }
         } catch (SQLException ex) {
             Logger.getLogger(RentalContractClass.class.getName()).log(Level.SEVERE, null, ex);
         }
         return "";
            
}
    
     public String NextID()
        {
            String prefixID="rc";
            if(GetLastID().equals(""))
           {
               return prefixID+"0001";  // fixwidth default
           }
            int nextID = Integer.parseInt(GetLastID().split("c")[1]) + 1;
            int lengthNumerID = GetLastID().length()- prefixID.length();
            String zeroNumber = "";
            for (int i = 1; i <= lengthNumerID; i++)
            {
                if (nextID < Math.pow(10, i))
                {
                    for (int j = 1; j <= lengthNumerID - i; i++)
                    {
                        zeroNumber += "0";
                    }
                    return prefixID + zeroNumber + ""+nextID;
                }
            }
            return prefixID + nextID;
 
        }
        
          
    
}
