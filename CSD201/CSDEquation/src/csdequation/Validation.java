/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdequation;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    private final static Scanner in = new Scanner(System.in);

    public static double checkInputDouble() {
        while (true) {
            try {
                double result;
                result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be double");
                System.out.print("Enter again: ");
            }
        }
    }
}
