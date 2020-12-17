/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdperfectnumber;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CSDPerfectNumber {

    /**
     * @param n
     * @return
     */
    static Scanner sc = new Scanner(System.in);

    public static int check(int n) {
        int s = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        if (s == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (check(i) == 1) {
                System.out.println(+i);
            }
        }
    }
}
