/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomaccessfiledemo;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Manager {

    public static void WriteObjectFile(ArrayList<Order> lo) {
        File f = new File("FruitOrder.dat");
        if (f.exists()) {
            f.delete();
        }
        try {
            FileOutputStream fos = new FileOutputStream("FruitOrder.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Order or : lo) {
                oos.writeObject(or);
            }
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(" " + e);
        }
    }

    public static void readObjectFile(String fileName) throws FileNotFoundException, IOException, java.io.EOFException {
        Order or = new Order();
        ArrayList<Order> llo = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("FruitOrder.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            or = (Order) ois.readObject();
            llo.add(or);
            while (or != null) {
                or = (Order) ois.readObject();
                llo.add(or);
            }
            ois.close();
            fis.close();
        } catch (IOException e) {
            System.out.println(" " + e);
        } catch (ClassNotFoundException e) {
            System.out.println(" " + e);
        }
        System.out.println(llo);
    }
}
