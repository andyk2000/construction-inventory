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

public class Inventory implements Serializable{
    
    private int ProductID;
    private String ProductName;
    private String Quantity;
    private String UnitePrice;

    public Inventory() {
    }

    public Inventory(int ProductID) {
        this.ProductID = ProductID;
    }

    public Inventory(int ProductID, String ProductName, String Quantity, String UnitePrice) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.Quantity = Quantity;
        this.UnitePrice = UnitePrice;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getUnitePrice() {
        return UnitePrice;
    }

    public void setUnitePrice(String UnitePrice) {
        this.UnitePrice = UnitePrice;
    }
    
    
    
}
