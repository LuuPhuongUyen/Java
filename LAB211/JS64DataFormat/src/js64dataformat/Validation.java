/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js64dataformat;

import java.text.*;
import java.util.*;

/**
 *
 * @author PC
 */
public class Validation {

    private static final Scanner in = new Scanner(System.in);
    private static final String PHONE_VALID = "^[0-9]{10}$";
    private static final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
    private static final String DATE_VALID="dd/MM/yyyy";

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public static String checkInputPhone() {
        while (true) {
            try {
                String resultCheck = checkInputString();
                if (!resultCheck.matches(PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return resultCheck;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be number");
            }
        }
    }

    public static String checkInputDate() {
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

    public static String checkInputEmail() {
        while (true) {
            String emailCheck = checkInputString();
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }
}
