/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makepassworddemo;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MakePasswordDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String firstName = "Ly";
        String middleName = "Quynh";
        String lastName = "Tran";
        String myString = ".com";
        String initials = "";
        if (firstName.length() < 2 || middleName.length() < 2 || lastName.length() < 2) {
            initials = firstName.substring(0, 1) + middleName.substring(0, 1)
                    + lastName.substring(0, 1);
        } else {
            initials = firstName.substring(1, 2) + middleName.substring(1, 2)
                    + lastName.substring(1, 2);
        }
        int age = 20;
        String password = initials + age;
        System.out.println("Password is " + password);
        System.out.println("Enter new password: ");
        String newPw = Validation.checkInputString().trim();
        if (password.equalsIgnoreCase(newPw)) {
            System.out.println("New password must be different from the old ones.");
        } else {
            password = newPw;
            System.out.println("New password is " + password);
        }
    }

}
