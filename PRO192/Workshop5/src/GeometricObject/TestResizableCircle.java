/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricObject;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class TestResizableCircle {

    public static void main(String[] args) {
        ResizableCircle c = new ResizableCircle(10);
        System.out.println("Circle with radius = " + c.radius);
        System.out.println("  Area = " + c.getArea());
        System.out.println("  Perimeter = " + c.getPerimeter());
        c.resize(50);
        System.out.println("Resize radius = " + c.radius);
        System.out.println("  Area = " + c.getArea());
        System.out.println("  Perimeter = " + c.getPerimeter());
    }
}
