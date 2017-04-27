/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.RentalContract;
import entity.User;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import model.DataProcess;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author SonCR
 */
public class RentalContractClass {
    HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        ServletContext context = request.getServletContext();
        private final String  path = context.getRealPath("/file/rentalcontract.xml");
    public  Document parserData(){
        Document doc = null;
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder =dbf.newDocumentBuilder();
            File f = new File(path);
            doc = builder.parse(f);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(RentalContractClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(RentalContractClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RentalContractClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doc;
    }
    
    public  ArrayList<RentalContract> allData(){
        Document doc = parserData();
        ArrayList<RentalContract> lst = new ArrayList<>();
        NodeList st =doc.getElementsByTagName("RentalContract");
            for (int i = 0; i < st.getLength(); i++) {
                RentalContract w = new RentalContract();
                Node temp = st.item(i);
                NodeList childs = temp.getChildNodes();
//                for (int j = 0; j < childs.getLength(); j++) {
//                    if(!childs.item(j).getNodeName().equals("#text")){
//                        
//                        System.out.println(childs.item(j).getTextContent()+"\t\t");
//                    }
//            }                
                         w.setRentalContractID(childs.item(1).getTextContent());                  
                         w.setUserName(childs.item(3).getTextContent());                 
                         w.setPlace(childs.item(5).getTextContent());
                         w.setJobDescription(childs.item(7).getTextContent());
                         w.setAdminID(childs.item(9).getTextContent());
                         w.setNumberOfWorker(Integer.parseInt(childs.item(11).getTextContent()));
                         w.setPrice(Float.parseFloat(childs.item(13).getTextContent()));
                         w.setStartTime(childs.item(15).getTextContent());
                         w.setEndTime(childs.item(17).getTextContent());
                         w.setStatus(childs.item(19).getTextContent());
                    lst.add(w);
//                   
            }
            return lst;
    }
     public boolean addContract(String userName,String place,String jobDescription,int numberOfWorker,String startTime){
       int result = 0;
        Document doc = parserData();
         Element root = doc.getDocumentElement();
                    //create root nội dung
                    Element st = doc.createElement("RentalContract");
                    //create StudentID node
                    Element id = doc.createElement("RentalContractID");
                    Text idValue = doc.createTextNode(getLastID());
                    id.appendChild(idValue);
                    //create StudentID node
                    Element name = doc.createElement("Username");
                    Text nameValue = doc.createTextNode(userName);
                    name.appendChild(nameValue);
                    //create StudentID node
                    Element mark = doc.createElement("Mark");
                    Text markValue = doc.createTextNode("22");
                    mark.appendChild(markValue);
                    //add con to Student
                    st.appendChild(id);
                    st.appendChild(name);
                    st.appendChild(mark);
                    //dua student vao root
                    root.appendChild(st);
        return result>0;
    }
     
     public String getLastID(){
         Document doc = parserData();
         int max =0;
            NodeList st =doc.getElementsByTagName("RentalContract");
            for (int i = 0; i < st.getLength(); i++) {
                Node temp = st.item(i);
                NodeList childs = temp.getChildNodes();
               
                
                for (int j = 0; j < childs.getLength(); j++) {
                    if((childs.item(j).getNodeName().equals("RentalContractID"))){
                        
                        if(Integer.parseInt(childs.item(j).getTextContent())>max){
                            max = Integer.parseInt(childs.item(j).getTextContent());
                        }
                    }
                }
                
            }
            return ""+max;
     }
    
     
     private  void save2File(Document doc) {
        TransformerFactory trans = TransformerFactory.newInstance();
        try {
            Transformer transformer = trans.newTransformer();
            DOMSource source = new DOMSource(doc);
            File f = new File(path);
            Result result = new StreamResult(f);
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            try {
                transformer.transform(source, result);
                System.out.println("create file success!");
            } catch (TransformerException ex) {
                Logger.getLogger(RentalContractClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(RentalContractClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
          
    
}
