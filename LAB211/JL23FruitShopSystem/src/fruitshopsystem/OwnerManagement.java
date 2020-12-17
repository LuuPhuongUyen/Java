/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitshopsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class OwnerManagement {

    private FruitShop fruitShop;
    private Shopping s;

    public OwnerManagement(FruitShop fruitShop, Shopping s) {
        this.fruitShop = fruitShop;
        this.s = s;
    }

    public void createFruit() {
        System.out.print("Enter fruit ID: ");
        String ID = Validation.checkInputString();
        if (fruitShop.checkExistID(ID) != -1) {
            System.err.println("ID already exist!");
            return;
        }
        System.out.print("Enter fruit name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter quantity: ");
        int quantity = Validation.checkInputInt();
        System.out.print("Enter price: ");
        int price = Validation.checkInputInt();
        System.out.print("Enter origin: ");
        String origin = Validation.checkInputString();
        Fruit fruit = new Fruit(ID, name, price, quantity, origin);
        fruitShop.addFruit(fruit);
    }

    public void viewOrder() {
        HashMap<String, ArrayList<Fruit>> orders = s.getOrders();
        if (orders.isEmpty()) {
            System.err.println("No order");
            return;
        }
        for (Map.Entry<String, ArrayList<Fruit>> entry : orders.entrySet()) {
            String key = entry.getKey();
            System.out.println("Customer: " + key);

            ArrayList<Fruit> value = entry.getValue();
            System.out.printf("%-3s | %-10s | %-10s | %-7s | %-7s\n", "ID", "Product", "Quantity", "Price", "Amount");
            for (Fruit fruit : value) {
                String ID = fruit.getfID();
                String name = fruit.getfName();
                int quantity = fruit.getQuantity();
                double price = fruit.getPrice();
                double amount = fruit.getPrice() * fruit.getQuantity();
                System.out.printf("%-3s | %-10s | %-10s | %-7.2f | %-7.2f\n", ID, name, quantity, price, amount);
            }
        }
    }
}
