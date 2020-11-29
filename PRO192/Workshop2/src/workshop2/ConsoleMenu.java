/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ConsoleMenu {

    static void function1() {
    }

    static void function2() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("============================");
            System.out.println("|   MENU SELECTION DEMO    |");
            System.out.println("============================");
            System.out.println("| Options:                 |");
            System.out.println("|        1. Option 1       |");
            System.out.println("|        2. Option 2       |");
            System.out.println("|        3. Exit           |");
            System.out.println("============================");
            System.out.println("Choose option:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Option 1 selected");
                    function1();
                    break;
                case 2:
                    System.out.println("Option 2 selected");
                    function2();
                    break;
                case 3:
                    System.out.println("Exit selected");
                    System.exit(0);
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        } while (choice > 3);
    }
}
