/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlpatientmanagementsystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    private final Scanner in = new Scanner(System.in);
    private final String PHONE_VALID = "^[0-9]{10}$";
    private final String DATE_VALID = "dd/MM/yyyy";

    public int checkInputIntLimit(int min, int max) {
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

    public String checkInputString() {
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

    public int checkInputInteger() {
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

    public double checkInputDouble() {
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

    public boolean checkInputYN() {
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

    public String checkInputCode() {
        while (true) {
            String result = checkInputString();
            if (result.length() == 4) {
                return result;
            }
            System.err.println("Code must have 4 characters");
            System.out.println("Enter again: ");
            in.nextLine();
        }
    }

    public String checkInputPhone() {
        while (true) {
            try {
                String resultCheck = checkInputString();
                if (!resultCheck.matches(PHONE_VALID)) {
                    System.err.println("Phone number must have 10 digits");
                } else {
                    return resultCheck;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be number");
            }
        }
    }

    public String checkInputDate() {
        while (true) {
            try {
                String dateCheck = checkInputString();
                DateFormat date = new SimpleDateFormat(DATE_VALID);
                date.setLenient(false);
                date.parse(dateCheck);
                return dateCheck;
            } catch (ParseException ex) {
                System.err.println("Invalid date!");
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }

    public String checkInputDischargedDate(String dischargedDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_VALID);
        String date = checkInputDate();
        Date fDate = formatter.parse(date);
        Date fDischargedDate = formatter.parse(dischargedDate);
        do {
            if ((fDate.getTime() - fDischargedDate.getTime()) <= 0) {
                System.err.println("Discharged date must later than hospitalized date");
                System.out.print("Enter again: ");
            }
        } while ((fDate.getTime() - fDischargedDate.getTime()) <= 0);
        return date;
    }

    public String checkInputGender() {
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
