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
public class ArrayDemo {

    public static int[] arrA = new int[100];
    public static Scanner input = new Scanner(System.in);

    static void EnterArray(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements: ");
            arrA[i] = input.nextInt();
        }
    }

    static void DisplayArray(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(" " + arrA[i]);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter n = ");
        int n = input.nextInt();
        arrA = new int[n];
        EnterArray(n);
        DisplayArray(n);
    }
}

