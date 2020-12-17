/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeDriverAbstract;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class ShapeDriver {

    public static void main(String[] args) {
        Circle cir1 = new Circle(9, "red", true);
        Shape cir2 = new Circle(4, "yellow", false);
        System.out.println(cir1);
        Square sq = new Square(7, "yellow", true);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
        System.out.println(sq);
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println();
    }
}
