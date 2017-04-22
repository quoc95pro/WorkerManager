/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DataProcess {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="";
            String url = "jdbc:mysql://localhost:3306/servjsp_workermanager?characterEncoding=utf-8";
            try {
                conn= (Connection) DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE,null,ex);
                
            }
        } catch (Exception e) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE,null,e);
        }
        return  conn;
}

    
}
