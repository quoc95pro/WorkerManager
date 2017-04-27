/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static com.sun.faces.facelets.util.Path.context;
import entity.User;
import entity.Work;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import model.DataProcess;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author khuon
 */
public class UserClass {
     HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        ServletContext context = request.getServletContext();
        private final String  path = context.getRealPath("/file/User.xml");
    public  Document parserData(){
        Document doc = null;
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder =dbf.newDocumentBuilder();
            File f = new File(path);
            doc = builder.parse(f);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(UserClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(UserClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doc;
    }
    
    public  ArrayList<User> allData(){
        Document doc = parserData();
        ArrayList<User> lst = new ArrayList<>();
        NodeList st =doc.getElementsByTagName("User");
            for (int i = 0; i < st.getLength(); i++) {
                User w = new User();
                Node temp = st.item(i);
                NodeList childs = temp.getChildNodes();
//                for (int j = 0; j < childs.getLength(); j++) {
//                    if(!childs.item(j).getNodeName().equals("#text")){
//                        
//                        System.out.println(childs.item(j).getTextContent()+"\t\t");
//                    }
//            }                
                         w.setUserName(childs.item(1).getTextContent());                  
                         w.setPassWord(childs.item(3).getTextContent());                 
                         w.setFullName(childs.item(5).getTextContent());
                         w.setPhoneNumber(childs.item(7).getTextContent());
                         w.setYearOfBirth(Integer.parseInt(childs.item(9).getTextContent()));
                         w.setAddress(childs.item(11).getTextContent());
                         w.setSex(childs.item(13).getTextContent());
                    lst.add(w);
//                   
            }
            return lst;
    }
    
    
    public Boolean checkLogin(String userName,String passWord){
        
        ArrayList<User> arr = allData();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getUserName().equals(userName)&&arr.get(i).getPassWord().equals(passWord)){
                return true;
            }
        }
        return false;
    }
    
    
       
      
  
     
}
