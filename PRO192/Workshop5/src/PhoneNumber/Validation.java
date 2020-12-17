/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneNumber;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    public final static Scanner in = new Scanner(System.in);
    private static final String VALID_PHONE = "[0-9]{3}[-][0-9]{3}[-][0-9]{4}";

    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(VALID_PHONE)) {
                return result;
            }
            System.out.println("Please input Phone flow\n" + "• 123-456-7890 \n");
            System.out.print("Enter again: ");
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    public static int checkInputInt() {

        int result;
        while (true) {
            result = in.nextInt();
            if (result < 0) {
                System.out.println("Can't be negative.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

}
