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
public class workerrentalcontract {
    private int workerRentalContractID;
    private String rentalContractID;
    private String workerID;
    private int days;
    private String status;

    public workerrentalcontract() {
    }

    public workerrentalcontract(int workerRentalContractID, String rentalContractID, String workerID, int days, String status) {
        this.workerRentalContractID = workerRentalContractID;
        this.rentalContractID = rentalContractID;
        this.workerID = workerID;
        this.days = days;
        this.status = status;
    }

    public int getWorkerRentalContractID() {
        return workerRentalContractID;
    }

    public void setWorkerRentalContractID(int workerRentalContractID) {
        this.workerRentalContractID = workerRentalContractID;
    }

    public String getRentalContractID() {
        return rentalContractID;
    }

    public void setRentalContractID(String rentalContractID) {
        this.rentalContractID = rentalContractID;
    }

    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
