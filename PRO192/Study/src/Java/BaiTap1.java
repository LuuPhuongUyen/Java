/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String name, address;
        int age;
        boolean gender;
        System.out.println("Enter name: ");
        name = in.nextLine();
        System.out.println("Enter address: ");
        address = in.nextLine();
        System.out.println("Enter age: ");
        age = in.nextInt();
        System.out.println("Enter gender: ");
        gender = in.nextBoolean();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        if (gender) {
            System.out.println("Gender: Male");
        } else {
            System.out.println("Gender: Female");
        }
    }

}
