/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdprime;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Prime {

    static Scanner sc = new Scanner(System.in);

    public int isPrime(int n) {
        int i;
        if (n < 2) {
            return 0;
        }
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public int printPrime() {
        int n, i;
        do {
            System.out.print("Enter n = ");
            n = sc.nextInt();
        } while (n < 2);
        for (i = 2; i <= n; i++) {
            if (isPrime(i) == 1) {
                System.out.print(" " + i);
            }
        }
        System.out.println("\n");
        return 0;
    }
}
