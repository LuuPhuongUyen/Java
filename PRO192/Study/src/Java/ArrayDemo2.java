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
public class ArrayDemo2 {

    public static Scanner input = new Scanner(System.in);

    static int[] EnterArray(int n) {
        int[] arrAtmp = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements: ");
            arrAtmp[i] = input.nextInt();
        }
        return arrAtmp;
    }

    public static void main(String[] args) {

        System.out.println("Enter n = ");
        int n = input.nextInt();
        int[] arrA = new int[n];
        arrA = EnterArray(n);
        for (int i = 0; i < n; i++) {
            System.out.println(" " + arrA[i]);
        }
    }
}
