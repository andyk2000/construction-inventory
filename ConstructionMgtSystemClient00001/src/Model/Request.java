/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author AMAZON
 */

public class Request implements Serializable{
    
    private int RequestID;
    private String EngineerEmail;
    private String productName;
    private String quantity;
    private String Answer;
    

    public Request() {
    }

    public Request(int RequestID) {
        this.RequestID = RequestID;
    }

    public Request(int RequestID, String EngineerEmail, String productName, String quantity, String Answer) {
        this.RequestID = RequestID;
        this.EngineerEmail = EngineerEmail;
        this.productName = productName;
        this.quantity = quantity;
        this.Answer = Answer;
    }

    

    public int getRequestID() {
        return RequestID;
    }

    public void setRequestID(int RequestID) {
        this.RequestID = RequestID;
    }




    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    public String getEngineerEmail() {
        return EngineerEmail;
    }

    public void setEngineerEmail(String EngineerEmail) {
        this.EngineerEmail = EngineerEmail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    
    
    
}
