/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js55doctor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {

    public int checkInputIntLimit(int min, int max) {
        Scanner in = new Scanner(System.in);
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

    public String checkInputString() {
        Scanner in = new Scanner(System.in);
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

    public int checkInputInt() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public boolean checkInputYN() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    public boolean checkCodeExist(ArrayList<Doctor> ld, String code) {
        Scanner in = new Scanner(System.in);
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDuplicate(ArrayList<Doctor> ld, String code,
            String name, String specialization, int availability) {
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())
                    && name.equalsIgnoreCase(doctor.getName())
                    && specialization.equalsIgnoreCase(doctor.getSpecialization())
                    && availability == doctor.getAvailability()) {
                return false;
            }
        }
        return true;
    }
}
