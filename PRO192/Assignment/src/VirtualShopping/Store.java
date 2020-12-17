/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualShopping;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PC
 */
public class Store {

    ArrayList<ShopItem> ls = new ArrayList<ShopItem>();

    public Store() {
    }

    public void addItems() {
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Add Software");
            System.out.println("3. Exit");
            int choice = Validation.checkInputIntLimit(1, 3);
            switch (choice) {
                case 1:
                    System.out.println("Please enter book name : ");
                    String bName = Validation.checkInputString();
                    System.out.println("Enter Book ID :");
                    String bId = Validation.checkInputString();
                    if (Validation.checkIdExist(ls, bId) != -1) {
                        System.err.println("ID has exist . Please re-input.");
                        System.out.println("Enter Book ID :");
                        bId = Validation.checkInputString();
                    }
                    System.out.println("Enter price:  ");
                    double bPrice = Validation.checkInputDouble();
                    System.out.println("Enter quantity: ");
                    int bQtt = Validation.checkInputInteger();
                    System.out.println("Enter weight:  ");
                    double weight = Validation.checkInputDouble();
                    ls.add(new Book(weight, bId, bName, bPrice, bQtt));
                    System.out.println("Add book success");
                    System.out.println("Continue? Y/N");
                    if (!Validation.checkInputYN()) {
                        return;
                    }
                    break;
                case 2:
                    System.out.println("Enter software name: ");
                    String sName = Validation.checkInputString();
                    System.out.println("Enter software id: ");
                    String sId = Validation.checkInputString();
                    if (Validation.checkIdExist(ls, sId) != -1) {
                        System.err.println("Id exists. Please re-input");
                        System.out.println("Enter Book ID :");
                        sId = Validation.checkInputString();
                    }
                    System.out.println("Enter software price: ");
                    double sPrice = Validation.checkInputDouble();
                    System.out.println("Enter software quantity: ");
                    int sQtt = Validation.checkInputInteger();
                    System.out.println("Enter software noCD: ");
                    int noCD = Validation.checkInputInteger();
                    ls.add(new Software(noCD, sId, sName, sPrice, sQtt));
                    System.out.println("Add software success");
                    System.out.println("Continue? Y/N");
                    if (!Validation.checkInputYN()) {
                        return;
                    }
                    break;
                case 3:
                    return;
            }
        }

    }

    public void displayListItems() {
        Collections.sort(ls);
        System.out.printf("%-5s %-10s %-15s %-7s %-9s %-5s\n", "ID", "Type", "Title", "Price", "Quantity", "Weight/CD");
//        for (ShopItem l : ls) {
//            System.out.println(l);
//        }
        for (int i = 0; i < ls.size(); i++) {
            ls.get(i).printData();
        }
    }

    public void updateItems() {
        if (ls.isEmpty()) {
            System.err.println("List empty");
            return;
        }
        System.out.println("Enter id to update: ");
        while (true) {
            String id = Validation.checkInputString();
            if (Validation.checkIdExist(ls, id) != -1) {
                for (int i = 0; i < ls.size(); i++) {
                    if (ls.get(i).getId().equalsIgnoreCase(id)) {
                        System.out.println("Enter item name: ");
                        String iName = Validation.checkInputString();
                        System.out.println("Enter item price: ");
                        double iPrice = Validation.checkInputDouble();
                        System.out.println("Enter item quantity: ");
                        int iQtt = Validation.checkInputInteger();
                        if (ls.get(i).getClass().getName().equalsIgnoreCase("VirtualShopping.Book")) {
                            System.out.println("Enter weight:  ");
                            double weight = Validation.checkInputDouble();
                            ls.set(i, new Book(weight, id, iName, iPrice, iQtt));
                        }
                        if (ls.get(i).getClass().getName().equalsIgnoreCase("VirtualShopping.Software")) {
                            System.out.println("Enter noCD:  ");
                            int noCD = Validation.checkInputInteger();
                            ls.set(i, new Software(noCD, id, iName, iPrice, iQtt));
                        }
                        System.err.println("Update success.");
                        return;
                    }
                }
            }
            System.out.println("Cant find the id");
            System.out.println("Enter again:");
        }
    }

    public void removeItems() {
        if (ls.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Enter id to remove: ");
        String id = Validation.checkInputString();
        int index = Validation.checkIdExist(ls, id);
        if (index == -1) {
            System.err.println("Not found id");
            return;
        }
        ls.remove(index);
        System.err.println("Delete success");
        return;
    }
}
