/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeDriverSuperclass;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class ShapeDriverSuperclass {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Square s1 = new Square();
        System.out.println(c1);
        System.out.println(" Area = " + c1.getArea() + "\n Perimeter = " + c1.getPerimeter());
        System.out.println(r1);
        System.out.println(" Area = " + r1.getArea() + "\n Perimeter = " + r1.getPerimeter());
        System.out.println(s1);
        System.out.println(" Area is " + s1.getArea() + "\n Perimeter is " + s1.getPerimeter());
        System.out.println();

        Circle c2 = new Circle(10, "red", false);
        Rectangle r2 = new Rectangle(5, 12, "green", true);
        Square s2 = new Square(15, "green", false);
        System.out.println(c2);
        System.out.println(" Area = " + c2.getArea() + "\n Perimeter = " + c2.getPerimeter());
        System.out.println(r2);
        System.out.println(" Area = " + r2.getArea() + "\n Perimeter = " + r2.getPerimeter());
        System.out.println(s2);
        System.out.println(" Area is " + s2.getArea() + "\n Perimeter is " + s2.getPerimeter());
        System.out.println();
    }
}
