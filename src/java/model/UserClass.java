/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DataProcess;

/**
 *
 * @author khuon
 */
public class UserClass {
    public boolean checkLogin(String userName,String passWord){
        boolean result = false;
        String sql="Select * from user where UserName=? and PassWord=?";
        try {
            PreparedStatement prst = DataProcess.getConnection().prepareStatement(sql);
            prst.setString(1, userName);
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
  
     public List<User> getAllUser() { 
        List<User> arr = new ArrayList<>();
        String str = "select * from user ";      
        try {
            PreparedStatement pstmt = DataProcess.getConnection().prepareStatement(str);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                User st = new User();
                st.setUserName(rs.getString("userName"));
                st.setPassWord(rs.getString("passWord"));
                st.setFullName(rs.getString("fullName"));
                st.setPhoneNumber(rs.getString("phoneNumber"));
                st.setYearOfBirth(rs.getInt("yearOfBirthday"));
                st.setSex(rs.getString("sex"));               
                arr.add(st);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserClass.class.getName()).log(Level.SEVERE, null, ex);
        } finally {          
        }
        return arr;

    }
    
}
