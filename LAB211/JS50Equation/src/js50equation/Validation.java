/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js50equation;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    private final static Scanner in = new Scanner(System.in);

    public static int menu() {
        System.out.println("|------------------------------------|");
        System.out.println("|               EQUATION             |");
        System.out.println("|------------------------------------|");
        System.out.println("| 1. Calculate Superlative Equation. |");
        System.out.println("| 2. Calculate Quadratic Equation.   |");
        System.out.println("| 3. EXIT.                           |");
        System.out.println("--------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 3);
        return choice;
    }

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + "," + max + "]");
                System.out.println("Enter again: ");
            }
        }
    }

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be double");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkOdd(double n) {
        return n % 2 == 1;
    }

    public static boolean checkEven(double n) {
        return n % 2 == 0;
    }

    public static boolean checkSquareNum(double n) {
        return (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }
}
