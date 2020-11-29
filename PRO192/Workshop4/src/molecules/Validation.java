/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molecules;

/**
 *
 * @author PC
 */
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Validation {

    static Scanner input = new Scanner(System.in);

    public static String checkInputString() {
        String result;
        while (true) {
            result = input.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("String can't be empty.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static double checkInputFloat() {
        while (true) {
            float result = input.nextFloat();
            if (result < 0) {
                System.out.println("Can't be negative.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }
}
