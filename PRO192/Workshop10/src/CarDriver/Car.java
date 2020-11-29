/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDriver;

/**
 *
 * @author PC
 */
public class Car {

    private String name;
    private double price;

    public Car() {
    }

    public Car newCar() {
        System.out.println("Enter name: ");
        this.name = Validation.checkInputString();
        System.out.println("Enter price: ");
        this.price = Validation.checkInputDouble();
        return this;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", price=" + price + '}';
    }
}
