/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitshopsystem;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Customer {

    private String customerName;
    private ArrayList<Fruit> cart = new ArrayList<>();
    private FruitShop fs;

    public Customer(String name, FruitShop fs) {
        this.customerName = name;
        this.fs = fs;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void buy() {
        System.out.print("Enter FruitID to get: ");
        String ID = Validation.checkInputString();
        int index = fs.checkExistID(ID);
        if (index == -1) {
            System.err.println("FruitID not exist");
            return;
        }

        Fruit fruitInList = fs.getFruitList().get(index);

        int indexCart = checkIDExistInCart(ID);
        if (indexCart == -1) {
            Fruit fruit;
            try {
                fruit = (Fruit) fruitInList.clone();
                System.out.print("Enter quantity to buy: ");
                int quantity = Validation.checkInputInt();
                if (quantity > fruitInList.getQuantity()) {
                    System.err.println("Not enough fruits.");
                    return;
                }
                fruitInList.setQuantity(fruitInList.getQuantity() - quantity);
                fruit.setQuantity(quantity);
                cart.add(fruit);
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Fruit fruitInCart = cart.get(indexCart);
            System.out.print("Enter quantity to buy: ");
            int quantity = Validation.checkInputInt();
            if (quantity > fruitInList.getQuantity()) {
                System.err.println("Not enough fruits.");
                return;
            }
            fruitInList.setQuantity(fruitInList.getQuantity() - quantity);
            fruitInCart.setQuantity(fruitInCart.getQuantity() + quantity);
        }

    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.err.println("Cart is empty.");
            return;
        }

        double total = 0;
        System.out.printf("%-3s | %-10s | %-10s | %-7s | %-7s\n", "ID", "Product", "Quantity", "Price", "Amount");
        for (Fruit fruit : cart) {
            String ID = fruit.getfID();
            String name = fruit.getfName();
            int quantity = fruit.getQuantity();
            double price = fruit.getPrice();
            double amount = fruit.getPrice() * fruit.getQuantity();
            System.out.printf("%-3s | %-10s | %-10s | %-7.2f | %-7.2f\n", ID, name, quantity, price, amount);
            total += amount;
        }
        System.out.println("TOTAL: $" + total);
    }

    public ArrayList<Fruit> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Fruit> cart) {
        this.cart = cart;
    }

    public FruitShop getFs() {
        return fs;
    }

    public void setFs(FruitShop fs) {
        this.fs = fs;
    }

    public int checkIDExistInCart(String ID) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getfID().equals(ID)) {
                return i;
            }
        }
        return - 1;
    }
}
