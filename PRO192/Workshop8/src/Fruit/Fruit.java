/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fruit;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class Fruit {

    private static final Scanner in = new Scanner(System.in);

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

    public static int checkInputInteger() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be integer");
                System.out.println("Enter again: ");
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
                System.out.println("Enter again: ");
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

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter fruit id: ");
            String fruitId = checkInputString();
            System.out.print("Enter fruit name: ");
            String fruitName = checkInputString();
            System.out.print("Enter price: ");
            double price = checkInputDouble();
            System.out.print("Enter quantity: ");
            int quantity = checkInputInteger();
            System.out.print("Enter origin: ");
            String origin = checkInputString();
            System.out.println(fruitId + " " + fruitName + " " + price + " " + quantity + " " + origin);
            System.out.println("Continue? Y/N");
            if (!checkInputYN()) {
                return;
            }
        }
    }
}
