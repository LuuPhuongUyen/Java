/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitshopsystem;

/**
 *
 * @author PC
 */
public class Fruit implements Cloneable {

    private String fID;
    private String fName;
    private double price;
    private int quantity;
    private String origin;

    public Fruit() {
    }

    public Fruit(String fID, String fName, double price, int quantity, String origin) {
        this.fID = fID;
        this.fName = fName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public String getfID() {
        return fID;
    }

    public void setfID(String fID) {
        this.fID = fID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void display() {
        System.out.printf("%-3s | %-10s | %-10d | %-7.2f | %-7s\n", fID, fName, quantity, price, origin);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
