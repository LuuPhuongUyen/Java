/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdequation;

/**
 *
 * @author PC
 */
public class Equation {

    public double quadracticEquation() {
        while (true) {
            System.out.print("\nEnter a = ");
            double a = Validation.checkInputDouble();
            System.out.print("Enter b = ");
            double b = Validation.checkInputDouble();
            System.out.print("Enter c = ");
            double c = Validation.checkInputDouble();
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("True with all x");
                    } else {
                        System.out.println("No root");
                    }
                } else {
                    double x = -c / b;
                    System.out.println("One solution x = " + x);
                }
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("No root");
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Two roots x1 = x2 = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Two distinct roots x1 = " + x1 + ", x2 = " + x2);
                }
                return 0;
            }
        }
    }
}
