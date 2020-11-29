/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi;

import Model.Magazine;
import java.rmi.Naming;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class Client {

    public Client() {
    }

    public static void main(String[] args) throws Exception {
        try {
            RemoteMagazine stub = (RemoteMagazine) Naming.lookup("rmi://localhost:1134/MagazineRemote");
            Vector<Vector> list = stub.listMagazines();
            // System.out.printf("%-6s %-27s %-16s %-6s\n", "ID", "Title", "Publisher", "Price");
            // System.out.println("---------------------------------------------------------------");
            //for (Vector v: list) {
            //System.out.printf("%-6s %-27s %-16s %-6f", list.getMaID(), mg.getMagazineTittle(), mg.getPublisher(), mg.getPrice());
            System.out.println(list);
            System.out.println("");
            // }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
