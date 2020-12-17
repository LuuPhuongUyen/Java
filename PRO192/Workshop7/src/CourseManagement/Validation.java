/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

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
                System.out.println("Enter again");
            } else {
                return result;
            }
        }
    }

    public static int checkInputInteger() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be integer");
                System.out.println("Enter again");
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

    public static String checkInputCourse() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("PRO")
                    || result.equalsIgnoreCase("DBI")
                    || result.equalsIgnoreCase("MAD")) {
                return result;
            }
            System.err.println("There are only three courses ID: PRO, DBI, MAD");
            System.out.println("Enter again: ");
        }
    }

    public static int checkIdExist(ArrayList<Course> ls, String id) {
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getCourseId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
}
