/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import Model.Engineer;
import java.rmi.RemoteException;
import java.util.List;
/**
 *
 * @author AMAZON
 */
public interface EngineerService extends Remote{
    public String registerEngineer(Engineer engineer) throws RemoteException;
    public String updateEngineer(Engineer engineer) throws RemoteException;
    public String deleteEngineer(Engineer engineer) throws RemoteException;
    public List<Engineer> getAllEngineer() throws RemoteException;
    public Engineer getEngineerById(Engineer engineer) throws RemoteException;
    
}
