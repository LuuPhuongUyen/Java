/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js73handyexpense;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    private final Scanner in = new Scanner(System.in);
    private final String DATE_VALID = "^\\d{1}|[0-3]{1}\\d{1}-[a-zA-Z]{3}-\\d{4}$";

    public String checkInputDate() {
        while (true) {
            try {
                String result = in.nextLine().trim();
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date date = format.parse(result);
                if (result.equalsIgnoreCase(format.format(date))) {
                    return result;
                } else {
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.err.println("Re-input follow format dd-MM-yyyy ");

            }
        }
    }

    public int checkInputInt() {
        int result;
        while (true) {
            try {
                result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input integer");
                System.out.println("Please enter again: ");
            }
        }
    }

    public String checkString() {
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Can be empty!!");
                System.out.print("Try again: ");
            } else {
                return result;
            }
        }
    }

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
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

    public double checkInputDouble() {
        double result;
        while (true) {
            try {
                result = Double.parseDouble(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.println("Please enter again: ");
            }
        }
    }

    public int menu() {
        System.out.println("************************************");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Quit");
        System.out.println("************************************");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 4);
        return choice;
    }
}
