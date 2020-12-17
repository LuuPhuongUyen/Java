package j2s018studentmanagementrmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public interface RemoteInterface extends Remote {

    public void savefile(String mail, String name, String age, String gender) throws RemoteException;
}
