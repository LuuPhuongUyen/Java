/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js74matrixcalculator;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    private final Scanner in = new Scanner(System.in);

    public int checkInputInt() {
        int result;
        while (true) {
            try {
                result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input integer");
                System.out.println("Please enter again: ");
            }
        }
    }

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public int menu() {
        System.out.println("************************************");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.println("************************************");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 4);
        return choice;
    }
}
