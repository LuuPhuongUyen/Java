/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js11basenumber;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    private final Scanner in = new Scanner(System.in);
    private final String BINARY_VALID = "[0-1]*";
    private final String DECIMAL_VALID = "[0-9]*";
    private final String HEXADECIMAL_VALID = "[0-9A-F]*";

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputBinary() {
        System.out.print("Enter number binary: ");
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.matches(BINARY_VALID)) {
                return result;
            }
            System.err.println("Must enter 0 or 1");
            System.out.print("Enter again: ");
        }
    }

    public String checkInputDecimal() {
        System.out.print("Enter number decimal: ");
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.matches(DECIMAL_VALID)) {
                return result;
            }
            System.err.println("Must  enter 0-9");
            System.out.print("Enter again: ");
        }
    }

    public String checkInputHexaDecimal() {
        System.out.print("Enter number hexadecimal: ");
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.matches(HEXADECIMAL_VALID)) {
                return result;
            }
            System.err.println("Must enter 0-9 A-F");
            System.out.print("Enter again: ");
        }
    }
}
