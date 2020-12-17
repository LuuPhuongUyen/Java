/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicledriver;

/**
 *
 * @author PC
 */
public class Bicycle implements IVehicle {

    private String name;
    private int model;
    int speed;
    int gear;

    public Bicycle() {
    }

    public Bicycle(String name, int model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Change gear called.");
    }

    @Override
    public void speedUp(int a) {
        speed = speed + a;
    }

    @Override
    public void applyBrakes(int a) {
        speed = speed - a;
    }

    public void print() {
        System.out.println("Name: " + name + " Model: " + model + " Speed: " + speed + " Gear: " + gear);
    }
}
