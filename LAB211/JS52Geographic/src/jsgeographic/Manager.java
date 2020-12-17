/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsgeographic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Manager {

    public int menu() {
        System.out.println("========================== GEOGRAPHIC ============================");
        System.out.println("1. Enter the information for 11 countries in Southeast Asia.");
        System.out.println("2. Display already information.");
        System.out.println("3. Search the country according to the entered country's name.");
        System.out.println("4. Display the information increasing with the country name.");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 5);
        return choice;
    }

    public static int checkInputIntLimit(int min, int max) {
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

    public static String checkInputString() {
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

    public static float checkInputFloat() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                float result = Float.parseFloat(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input float");
                System.out.print("Enter again: ");
            }
        }
    }

    public void inputCountry(ArrayList<Country> lc) {
        System.out.print("Enter code of country: ");
        String countryCode = checkInputString();
        if (!checkCountryExist(lc, countryCode)) {
            System.err.println("Country existed!");
            return;
        }
        System.out.print("Enter name of country: ");
        String countryName = checkInputString();
        System.out.print("Enter total area: ");
        float countryArea = checkInputFloat();
        System.out.print("Enter terrain of country: ");
        String countryTerrain = checkInputString();
        lc.add(new Country(countryCode, countryName, countryArea, countryTerrain));
        System.err.println("Add successfully!");
    }

    public void printCountry(ArrayList<Country> lc) {
        System.out.printf("%-10s%-20s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    public void printAscending(ArrayList<Country> lc) {
        Collections.sort(lc);
        System.out.printf("%-10s%-20s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    public void searchName(ArrayList<Country> lc) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = checkInputString();
        System.out.printf("%-10s%-20s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    }

    public boolean checkCountryExist(ArrayList<Country> lc, String countryCode) {
        for (Country country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }
}
