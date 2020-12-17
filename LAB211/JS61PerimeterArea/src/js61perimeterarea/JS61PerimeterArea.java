/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js61perimeterarea;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JS61PerimeterArea {

    /**
     * @param args the command line arguments
     */
    private static final Scanner in = new Scanner(System.in);

    private static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Re-input");
            }
        }
    }

    private static Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Re-input");
            }
        }

    }

    private static Rectangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = checkInputDouble();
        return new Rectangle(width, length);
    }

    private static Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = checkInputDouble();
        return new Circle(radius);
    }

    private static void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        System.out.println("--------Rectangle-------");
        rectangle.printResult();
        System.out.println("--------Circle--------");
        circle.printResult();
        System.out.println("--------Triangle--------");
        trigle.printResult();
    }

    public static void main(String[] args) {
        // TODO code application logic here         
        Rectangle rectangle = inputRectangle();
        Circle circle = inputCircle();
        Triangle trigle = inputTriangle();
        display(trigle, rectangle, circle);
    }
}
