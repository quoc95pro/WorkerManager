/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Work;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author quoc95
 */
public class WorkClass {
    HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        ServletContext context = request.getServletContext();
        private final String  path = context.getRealPath("/file/WorkClass.xml");
    public  Document parserData(){
        Document doc = null;
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder =dbf.newDocumentBuilder();
            File f = new File(path);
            doc = builder.parse(f);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(WorkClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(WorkClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WorkClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doc;
    }
    
    public  ArrayList<Work> allData(){
        Document doc = parserData();
        ArrayList<Work> lst = new ArrayList<>();
        NodeList st =doc.getElementsByTagName("Work");
            for (int i = 0; i < st.getLength(); i++) {
                Work w = new Work();
                Node temp = st.item(i);
                NodeList childs = temp.getChildNodes();
//                for (int j = 0; j < childs.getLength(); j++) {
//                    if(!childs.item(j).getNodeName().equals("#text")){
//                        
//                        System.out.println(childs.item(j).getTextContent()+"\t\t");
//                    }
//            }
                    
                         w.setId(Integer.parseInt(childs.item(1).getTextContent()));
                    
                    
                         w.setName(childs.item(3).getTextContent());
           
                   
                         w.setDescription(childs.item(5).getTextContent());
                    
                         w.setLink(childs.item(7).getTextContent());
              
                    lst.add(w);
//                
                
            }
            return lst;
    }
    
//    public static ArrayList<Node> search(String name){
//        Document doc = parserData();
//        ArrayList<Node> result = new ArrayList<Node>();
//        NodeList temp = doc.getElementsByTagName("StudentName");
//        for (int i = 0; i < temp.getLength(); i++) {
//            String text = temp.item(i).getTextContent();
//            if(text.startsWith(name)||text.endsWith(name)){
//                Node p = temp.item(i).getParentNode();
//                result.add(p);
//            }
//        }
//        return result;
//    }
    public static void main(String[] args) {
//        ArrayList<Work> w = allData();
//        for (int i = 0; i < w.size(); i++) {
//            System.out.println(""+w.get(i).getId());
//            System.out.println(""+w.get(i).getName());
//            System.out.println(""+w.get(i).getDescription());
//            System.out.println(""+w.get(i).getLink());
//        }
    }
}
