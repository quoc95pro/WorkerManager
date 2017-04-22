/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Work;
import java.util.ArrayList;
import model.WorkClass;

/**
 *
 * @author quoc95
 */
public class WorkBean {
    private int id;
   private String name;
   private String description;
   private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Creates a new instance of WorkBean
     */
    public WorkBean() {
    }
    
    public ArrayList<Work> getdata(){
        WorkClass wc = new WorkClass();
        ArrayList<Work> arr = wc.WorkList();
        return arr;
    }
}
