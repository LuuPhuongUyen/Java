/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlowerDriver;

/**
 *
 * @author PC
 */
public class Flower {

    private String name;
    private double price;
    private String color;

    public Flower() {
    }

    public Flower(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flower{" + "name=" + name + ", price=" + price + ", color=" + color + '}';
    }

}
