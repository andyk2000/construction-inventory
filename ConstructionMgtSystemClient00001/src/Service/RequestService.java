/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Request;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author AMAZON
 */
public interface RequestService extends Remote{
    
    public String registerRequest(Request request) throws RemoteException;
    public String updateRequest(Request request) throws RemoteException;
    public String deleteRequest(Request request) throws RemoteException;
    public List<Request> getAllRequest() throws RemoteException;
    public Request getRequestById(Request request) throws RemoteException;
    
}
