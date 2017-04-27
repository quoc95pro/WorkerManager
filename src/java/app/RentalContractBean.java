/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import static java.lang.System.out;
import java.util.Map;
import javax.faces.context.FacesContext;
import model.RentalContractClass;
import model.WorkClass;
import model.WorkerClass;

/**
 *
 * @author quoc95
 */
public class RentalContractBean {
    
    private String rentalContractID;// 
    private String userName;
    private String place;// địa điểm
    private String jobDescription;// mô tả công việc
    private String adminID;
    private int numberOfWorker;
    private float price;
    private String startTime;// bắt đầu
    private String endTime;// kết thúc
    private String status;// mặc định pending 

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRentalContractID() {
        return rentalContractID;
    }

    public void setRentalContractID(String rentalContractID) {
        this.rentalContractID = rentalContractID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfWorker() {
        return numberOfWorker;
    }

    public void setNumberOfWorker(int numberOfWorker) {
        this.numberOfWorker = numberOfWorker;
    }
    
    /**
     * Creates a new instance of RentalContractBean
     */
    public RentalContractBean() {
    }
    
    public String addContract(){
        RentalContractClass rc = new RentalContractClass();
        Map<String,String> params =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        
	  String username = params.get("username");
          String description = params.get("jobDescription");
          out.print("ooooooooooooooooooooooooooooooooo"+jobDescription);
          out.print("ooooooooooooooooooooooooooooooooo"+description);
          if(description.equals(""))
          {}
          else{
              WorkClass wc = new WorkClass();
             
              
            
              
          }
          
        if(rc.addContract(username, place, jobDescription, numberOfWorker, startTime))
            return "success";
        return "fail";
    }
    
    
}
