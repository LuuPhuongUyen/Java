/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2p2;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class DayOfDate {

    static int days[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String name[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input month and date:");

        for(;;) {
            int m = in.nextInt(), d = in.nextInt();
            if (m == 0 && d == 0) {
                break;
            }
            System.out.println(solve(m, d));
        }
    }

    static String solve(int month, int date) {
        int cur = 3;
        System.out.print("Name of the day: ");
        for (int i = 0; i < month - 1; i++) {
            cur += days[i];
        }
        cur += date - 1;
        return name[cur % 7];
    }
}
