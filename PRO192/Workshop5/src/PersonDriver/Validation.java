/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDriver;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    static Scanner in = new Scanner(System.in);

    public static String checkInputString() {
        String result;
        while (true) {
            result = in.nextLine();
            if (result.isEmpty()) {
                System.out.println("String can't be empty.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static double checkInputDouble() {
        double result;
        while (true) {
            result = in.nextDouble();
            if (result < 0) {
                System.out.println("Can't be negative.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }
}
