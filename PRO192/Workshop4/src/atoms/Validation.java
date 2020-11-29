/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atoms;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
import static atoms.Atoms.input;
import java.util.Scanner;


public class Validation {

    

    public static String checkInputString() {
        String result;
        while (true) {
            result = input.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("String can't be empty.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static float checkInputFloat() {
        while (true) {
            float result = input.nextFloat();
            if (result < 0) {
                System.out.println("Can't be negative.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkInputInt() {

        int result;
        while (true) {
            result = input.nextInt();
            if (result < 0) {
                System.out.println("Can't be negative.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean accept() {
        while (true) {
            String result = Validation.checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N!");
            System.out.println("Enter again: ");
        }
    }
}
