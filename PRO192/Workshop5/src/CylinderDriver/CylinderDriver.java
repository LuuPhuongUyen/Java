/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CylinderDriver;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class CylinderDriver {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.printf("Cylinder:\n radius=%.2f\n height=%.2f\n base area=%.2f\n volume=%.2f", c1.getRadius(),
                 c1.getHeight(), c1.getArea(), c1.getVolume());
        Cylinder c2 = new Cylinder(10.0);
        System.out.printf("\nCylinder:\n radius=%.2f\n height=%.2f\n base area=%.2f\n volume=%.2f", c2.getRadius(),
                 c2.getHeight(), c2.getArea(), c2.getVolume());
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.printf("\nCylinder:\n radius=%.2f\n height=%.2f\n base area=%.2f\n volume=%.2f\n", c3.getRadius(),
                 c3.getHeight(), c3.getArea(), c3.getVolume());
    }
}
