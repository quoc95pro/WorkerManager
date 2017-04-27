/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.AdminClass;

/**
 *
 * @author quoc95
 */
public class AdminBean {
    private String adminID;
    private String passWord;
    private String fullName;
    private String phoneNumber;
    private String authority;

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
    
    
    /**
     * Creates a new instance of AdminBean
     */
    public AdminBean() {
    }
    public String checklogin(){
        AdminClass ac = new AdminClass();
        if(ac.checkLogin(adminID, passWord)){
            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
           HttpSession session = request.getSession();
           
            session.setAttribute("userNameAdmin", adminID);
            return "success";
        }
        return "fail";
    }
}
