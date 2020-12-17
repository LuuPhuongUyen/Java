/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursespe;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author PC
 */
public class Server extends CourseImpl{

    public Server() {
    }

    public static void main(String args[]) throws RemoteException {
        try {
            CourseImpl r = new CourseImpl();
            LocateRegistry.createRegistry(1156);
            Runtime rt = Runtime.getRuntime();
            rt.exec("rmiregistry.exe");
            Naming.rebind("rmi://localhost:1156/CourseRemote", r);
            System.out.println("Server is ready!");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
