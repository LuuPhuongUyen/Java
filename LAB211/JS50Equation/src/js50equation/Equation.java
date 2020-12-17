/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js50equation;

/**
 *
 * @author PC
 */
public class Equation {

    public void superlativeEquation() {
        while (true) {
            System.out.print("Enter a = ");
            double a = Validation.checkInputDouble();
            System.out.print("Enter b = ");
            double b = Validation.checkInputDouble();
            double x = -b / a;
            if (a == 0) {
                if (b == 0) {
                    System.out.println("True with all x\n");
                } else {
                    System.err.println("Please enter a <> 0\n");
                    return;
                }
            } else {
                System.out.println("Solution x = " + x);
            }
            System.out.print("Odd number: ");
            if (Validation.checkOdd(a)) {
                System.out.print(a + " ");
            }
            if (Validation.checkOdd(b)) {
                System.out.print(b + " ");
            }
            System.out.println("\n");
            System.out.print("Even number: ");
            if (Validation.checkEven(a)) {
                System.out.print(a + " ");
            }
            if (Validation.checkEven(b)) {
                System.out.print(b + " ");
            }
            System.out.println("\n");
            System.out.print("Square number: ");
            if (Validation.checkSquareNum(a)) {
                System.out.print(a + " ");
            }
            if (Validation.checkSquareNum(b)) {
                System.out.print(b + " ");
            }
            System.out.println("\n");
            return;
        }
    }

    public void quadraticEquation() {
        while (true) {
            System.out.print("Enter a = ");
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
                    System.out.println("No root\n");
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Two roots x1 = x2 = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Two distinct roots x1 = " + x1 + ", x2 = " + x2);
                }
            }
            System.out.print("Odd number: ");
            if (Validation.checkOdd(a)) {
                System.out.print(a + " ");
            }
            if (Validation.checkOdd(b)) {
                System.out.print(b + " ");
            }
            if (Validation.checkOdd(c)) {
                System.out.print(c + " ");
            }
            System.out.println("\n");
            System.out.print("Even number: ");
            if (Validation.checkEven(a)) {
                System.out.print(a + " ");
            }
            if (Validation.checkEven(b)) {
                System.out.print(b + " ");
            }
            if (Validation.checkEven(c)) {
                System.out.print(c + " ");
            }
            System.out.println("\n");
            System.out.print("Square number: ");
            if (Validation.checkSquareNum(a)) {
                System.out.print(a + " ");
            }
            if (Validation.checkSquareNum(b)) {
                System.out.print(b + " ");
            }
            if (Validation.checkSquareNum(c)) {
                System.out.print(c + " ");
            }
            System.out.println("\n");
            return;
        }
    }
}
