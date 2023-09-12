/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Inventory;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author AMAZON
 */
public interface InventoryService extends Remote{
    public String registerInventory(Inventory inventory) throws RemoteException;
    public String updateInventory(Inventory inventory) throws RemoteException;
    public String deleteInventory(Inventory inventory) throws RemoteException;
    public List<Inventory> getAllInventory() throws RemoteException;
    public Inventory getInventoryById(Inventory inventory) throws RemoteException;
}
