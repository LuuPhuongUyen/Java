/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patienthospitaldemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be integer");
                System.out.println("Enter again");
            }
        }
    }

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be double");
                System.out.print("Enter again: ");
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

    public static String checkInputCode() {
        while (true) {
            String result = checkInputString();
            if (result.length() == 4) {
                return result;
            }
            System.err.println("Code must have 4 characters");
            System.out.println("Enter again: ");
            Validation.in.nextLine();
        }
    }

    public static Date checkInputDate() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String result = checkInputString();
        Date date = new Date();
        try {
            date = formater.parse(result);
        } catch (ParseException e) {
            System.err.println("Please input in format (dd/MM/yyyy)");
            System.out.print("Enter again: ");
            checkInputDate();
        }
        return date;
    }

    public static Date checkInputDischargedDate(Date dischargedDate) {
        Date date = new Date();
        do {
            date = checkInputDate();
            if ((date.getTime() - dischargedDate.getTime()) <= 0) {
                System.err.println("Discharged date must later than hospitalized date");
                System.out.print("Enter again: ");
            }
        } while ((date.getTime() - dischargedDate.getTime()) <= 0);
        return date;
    }

    public static String checkInputGender() {
        String result;
        while (true) {
            result = in.nextLine();
            if (result.equalsIgnoreCase("m")) {
                return "Male";
            }
            if (result.equalsIgnoreCase("f")) {
                return "Female";
            }
            System.err.println("Please input f/F or m/M");
            System.out.println("Enter again: ");
        }
    }
}
