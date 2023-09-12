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

public class Engineer implements Serializable{
    
    private int EngineerID;
    private String Fname;
    private String Lname;
    private String Email;
    private String Phone;
    private String password;

    public Engineer() {
    }

    public Engineer(int EngineerID) {
        this.EngineerID = EngineerID;
    }

    public Engineer(int EngineerID, String Fname, String Lname, String Email, String Phone, String password) {
        this.EngineerID = EngineerID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Email = Email;
        this.Phone = Phone;
        this.password = password;
    }

    public int getEngineerID() {
        return EngineerID;
    }

    public void setEngineerID(int EngineerID) {
        this.EngineerID = EngineerID;
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
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
