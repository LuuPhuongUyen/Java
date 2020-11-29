/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdmax;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CSDMax {

    /**
     * @param n
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static int[] inputArr(int n) {
        int[] result = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }
        return result;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
        return max;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr = inputArr(n);
        max(arr);
    }
}
