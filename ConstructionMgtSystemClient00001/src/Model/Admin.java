/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;


/**
 *
 * @author AMAZON
 */

public class Admin {
    private int AdminId;
    private String username;
    private String password;
    private String email;
    
    
    private List<Account> Admin;

    public Admin() {
    }

    public Admin(int AdminId) {
        this.AdminId = AdminId;
    }

    public Admin(int AdminId, String username, String password, String email, List<Account> Admin) {
        this.AdminId = AdminId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.Admin = Admin;
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int AdminId) {
        this.AdminId = AdminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAdmin() {
        return Admin;
    }

    public void setAdmin(List<Account> Admin) {
        this.Admin = Admin;
    }
    
}
