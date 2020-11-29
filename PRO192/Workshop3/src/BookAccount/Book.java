/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookAccount;

/**
 *
 * @author PC
 */
public class Book {

    private String name;
    private Author aut;
    private double price;
    private int qty = 0;

    public Book() {
    }

    public Book(String name, Author aut, double price) {
        this.name = name;
        this.aut = aut;
        this.price = price;
    }

    public Book(String name, Author aut, double price, int qty) {
        this.name = name;
        this.aut = aut;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAut() {
        return aut;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{name: " + name +", "+ aut + ", price = " + price + ", qty = " + qty+"}";
    }

}
