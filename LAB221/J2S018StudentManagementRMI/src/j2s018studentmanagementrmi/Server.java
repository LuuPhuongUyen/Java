/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s018studentmanagementrmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Server {

    public static void main(String[] args) {
        try {
            StudentImplement im = new StudentImplement();
            LocateRegistry.createRegistry(1346);
            Naming.rebind("rmi://localhost:1346/StudentRemote", im);
            System.out.println("Server started!!");
        } catch (RemoteException e) {
            System.out.println(e.toString());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
