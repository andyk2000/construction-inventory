/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;



/**
 *
 * @author AMAZON
 */

public class Logistics implements Serializable{
    
    private int LogisticID;
    private String Fname;
    private String Lname;
    private String email;
    private String phone;
    private String password;

    public Logistics() {
    }

    public Logistics(int LogisticID) {
        this.LogisticID = LogisticID;
    }

    public Logistics(int LogisticID, String Fname, String Lname, String email, String phone, String password) {
        this.LogisticID = LogisticID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getLogisticID() {
        return LogisticID;
    }

    public void setLogisticID(int LogisticID) {
        this.LogisticID = LogisticID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
