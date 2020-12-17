/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualShopping;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author PC
 */
public class Manager {

    static int menu() {
        System.out.println("1. Admin Roles");
        System.out.println("2. Customer Roles");
        System.out.println("3. Exits");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }

    static int menuAdmin() {
        System.out.println("1. Add Items");
        System.out.println("2. Update Items");
        System.out.println("3. View Items");
        System.out.println("4. Remove Items");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }

    static int menuCustomer() {
        System.out.println("1. Add to Shopping Basket");
        System.out.println("2. Display the Shopping Basket");
        System.out.println("3. Remove from Shopping Basket");
        System.out.println("4. Print Invoice(Orders)");
        System.out.println("5. Save and load file");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 6);
        return choice;
    }

    public static void WriteObjectFile(ArrayList<ShopItem> ls) {
        File f = new File("Shop.dat");
        if (f.exists()) {
            f.delete();
        }
        try {
            FileOutputStream fos = new FileOutputStream("Shop.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (ShopItem si : ls) {
                oos.writeObject(si);
            }
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("" + e);
        }
    }

    public static void ReadObjectFile(String filename) throws FileNotFoundException, IOException, java.io.EOFException {
        ShopItem bs = new ShopItem();
        ArrayList<ShopItem> lsi = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("Shop.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            bs = (ShopItem) ois.readObject();
            lsi.add(bs);
            while (bs != null) {
                bs = (ShopItem) ois.readObject();
                lsi.add(bs);
            }
            ois.close();
            fis.close();
        } catch (IOException io) {
            //System.out.println(" " + io);
        } catch (ClassNotFoundException e) {
            System.out.println("" + e);
        }
        System.out.printf("%-7s%-15s%-15s%-9s%-12s%-15s\n", "ID", "Type", "Item", "Price", "Quantity", "Weight/CD");
        for (int i = 0; i < lsi.size(); i++) {
            lsi.get(i).printData();
        }
    }
}
