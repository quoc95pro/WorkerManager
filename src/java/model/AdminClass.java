/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DataProcess;

/**
 *
 * @author admin
 */
public class AdminClass {
    public boolean checkLogin(String adminID,String passWord){
        boolean result = false;
        String sql="Select * from admin where AdminID=? and PassWord=?";
        try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            prst.setString(1, adminID);
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
}
