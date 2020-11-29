/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author PC
 */
public class Server extends MagazineImpl{

    public Server() {
    }

    public static void main(String args[]) throws RemoteException {
        try {
            MagazineImpl r = new MagazineImpl();
            LocateRegistry.createRegistry(1134);
            Runtime rt = Runtime.getRuntime();
            rt.exec("rmiregistry.exe");
            Naming.rebind("rmi://localhost:1134/MagazineRemote", r);
            System.out.println("Server is ready!");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
