/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author admin
 */
public class RentalContract {
    private String rentalContractID;// 
    private String userName;
    private String place;// địa điểm
    private String jobDescription;// mô tả công việc
    private int numberOfWorker	;
    private String adminID;
    private float price;
    private String startTime;// bắt đầu
    private String endTime;// kết thúc
    private String status;// mặc định pending 

    public int getNumberOfWorker() {
        return numberOfWorker;
    }

    public void setNumberOfWorker(int numberOfWorker) {
        this.numberOfWorker = numberOfWorker;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public RentalContract() {
    }

    public RentalContract(String rentalContractID, String userName,String place,int numberOfWorker, String jobDescription, String adminID, float price, String startTime, String endTime, String status) {
        this.rentalContractID = rentalContractID;
        this.userName = userName;
        this.numberOfWorker =numberOfWorker;
        this.jobDescription = jobDescription;
        this.adminID = adminID;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
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
    
    
}
