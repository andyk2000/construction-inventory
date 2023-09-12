/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;

/**
 *
 * @author AMAZON
 */

public class Account {
    private int AccountID;
    private String username;
    private String accountype;
    private String Departrment;
    
    
    private Admin AdminId;

    public Account() {
    }

    public Account(int AccountID) {
        this.AccountID = AccountID;
    }

    public Account(int AccountID, String username, String accountype, String Departrment, Admin AdminId) {
        this.AccountID = AccountID;
        this.username = username;
        this.accountype = accountype;
        this.Departrment = Departrment;
        this.AdminId = AdminId;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountype() {
        return accountype;
    }

    public void setAccountype(String accountype) {
        this.accountype = accountype;
    }

    public String getDepartrment() {
        return Departrment;
    }

    public void setDepartrment(String Departrment) {
        this.Departrment = Departrment;
    }

    public Admin getAdminId() {
        return AdminId;
    }

    public void setAdminId(Admin AdminId) {
        this.AdminId = AdminId;
    }
    
}
