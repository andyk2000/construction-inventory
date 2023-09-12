/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Logistics;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author AMAZON
 */
public interface LogisticsService extends Remote{
    
    public String registerLogistics(Logistics logistics) throws RemoteException;
    public String updateLogistics(Logistics logistics) throws RemoteException;
    public String deleteLogistics(Logistics logistics) throws RemoteException;
    public List<Logistics> getAllLogistics() throws RemoteException;
    public Logistics getLogisticsById(Logistics logistics) throws RemoteException;
    
}
