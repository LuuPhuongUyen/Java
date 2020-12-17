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
public class SumOfArray {

    static Scanner sc = new Scanner(System.in);

    public static int[] inputArr(int n) {
        int[] result = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }
        return result;
    }

    public static int sumValues(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int n, sum = 0;
        System.out.printf("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        arr = inputArr(n);
        sum = sumValues(arr);
        System.out.println("The sum is " + sum);
    }
}
