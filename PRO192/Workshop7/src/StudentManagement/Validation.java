/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    private final static Scanner in = new Scanner(System.in);

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

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N");
            System.out.println("Enter again: ");
        }
    }

    public static char checkInputUD() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return 'U';
            }
            if (result.equalsIgnoreCase("D")) {
                return 'D';
            }
            System.err.println("Please input u/U or d/D");
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
            System.err.println("There are only three courses: Java, .Net, C/C=++");
            System.out.println("Enter again: ");
        }
    }

    public static int checkIdExist(ArrayList<Student> ls, String id) {
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
}
