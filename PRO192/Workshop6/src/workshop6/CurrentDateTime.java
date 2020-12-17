/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

import java.util.Calendar;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class CurrentDateTime {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time:");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
