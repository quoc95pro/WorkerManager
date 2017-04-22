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
public class Worker {
    private String workerID;
    private String passWord;
    private String fullName;
    private int yearOfBirth;
    private String type;
    private String description;
    private int worksCompleted;
    private float pricePerDay;
    private String status;

    public Worker() {
    }

    public Worker(String workerID, String passWord, String fullName, int yearOfBirth, String type, String description, int worksCompleted, float pricePerDay, String status) {
        this.workerID = workerID;
        this.passWord = passWord;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.type = type;
        this.description = description;
        this.worksCompleted = worksCompleted;
        this.pricePerDay = pricePerDay;
        this.status = status;
    }

    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWorksCompleted() {
        return worksCompleted;
    }

    public void setWorksCompleted(int worksCompleted) {
        this.worksCompleted = worksCompleted;
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
