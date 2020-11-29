/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author PC
 */
public class Customers {

    private int ID;
    private String name;
    private int discount;

    public Customers() {
    }

    public Customers(int id, String n, int d) {
        this.ID = id;
        this.name = n;
        this.discount = d;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Employee [id: " + ID + " name: " + name + " " + "discount: " + discount + "]";
    }
}
