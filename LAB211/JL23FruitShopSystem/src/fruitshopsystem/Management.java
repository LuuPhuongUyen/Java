/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitshopsystem;

/**
 *
 * @author PC
 */
public class Management {

    public void mainMenu() {
        System.out.println("======= Main Menu =======");
        System.out.println("1. Owner");
        System.out.println("2. Customer");
        System.out.println("3. Exit");
    }

    public void customerMenu() {
        System.out.println("======= Customer Menu =======");
        System.out.println("1. Buy fruit.");
        System.out.println("2. View my cart.");
        System.out.println("3. Return to main menu.");
    }

    public void ownerMenu() {
        System.out.println("======= Owner Menu =======");
        System.out.println("1. View Fruit List");
        System.out.println("2. Create Fruit.");
        System.out.println("3. View orders");
        System.out.println("4. Return to main menu.");
    }
}
