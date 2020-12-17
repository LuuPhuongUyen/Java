/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js79zipunzipfile;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {
    private final static Scanner input2 = new Scanner(System.in);

    public static int checkinputLimit(int min, int max) {
        int result;
        while (true) {
            try {
                result = Integer.parseInt(input2.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Please enter again: ");
            }
        }
    }

    public static String checkinputString() {
        String result = input2.nextLine();
        if (result.isEmpty()) {
            System.err.println("String can't be empty!");
            System.out.println("Please enter again.\n");
            return checkinputString();
        } else {
            return result;
        }
    }

    public static int checkinputInt() {
        int result;
        while (true) {
            result = input2.nextInt();
            if (result < 0) {
                System.err.println("Can't input negative number!");
                System.out.println("Please input again.");
            } else {
                return result;
            }
        }
    }
}
