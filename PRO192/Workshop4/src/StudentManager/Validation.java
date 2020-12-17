/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManager;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
import java.util.Scanner;

public class Validation {

    public static Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            int result = Integer.parseInt(in.nextLine().trim());
            if (result >= min || result <= max) {
                return result;
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("String can't be empty.");
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

    public static String checkInputCourse() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("java")
                    || result.equalsIgnoreCase(".net")
                    || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }
}
