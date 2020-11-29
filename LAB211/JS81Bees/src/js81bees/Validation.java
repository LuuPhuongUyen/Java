/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js81bees;

import java.util.Scanner;

/**
 *
 * @author HaiTr
 */
public class Validation {

    public static String checkInputString() {
        Scanner sc = new Scanner(System.in);
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Can not be empty!");
                System.out.print("Please enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(Validation.checkInputString());
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

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(Validation.checkInputString());
                if (result > 0) {
                    return result;
                } else {
                    System.err.println("Must be greater than 0");
                    System.out.print("Enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please Input Integer Number!");
                System.out.print("Enter again: ");
            }
        }
    }

}
