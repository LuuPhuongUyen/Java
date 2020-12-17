/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2p2;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class QuadraticEquation {

    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic equation: ax^2+bx+c=0\n");
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();
        double result = b * b - 4 * a * c;
        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The equation has two real roots " + r1 + " and " + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2 * a);
            System.out.println("The roots are " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
