/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManager;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class ValidationSimple {

    private static final Scanner scn = new Scanner(System.in);

    public static float checkInputFloat() {
        return Float.parseFloat(scn.nextLine());
    }

    public static double checkInputDouble() {
        return Double.parseDouble(scn.nextLine());
    }

    public static int checkInputInteger() {
        return Integer.parseInt(scn.nextLine());
    }

    public static long checkInputLong() {
        return Long.parseLong(scn.nextLine());
    }

    public static String checkInputString() {
        return scn.nextLine();
    }
}
