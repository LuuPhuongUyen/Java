/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class OddEvenNum {

    static Scanner sc = new Scanner(System.in);

    public static int[] inputArr(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements: ");
            result[i] = sc.nextInt();
        }
        return result;
    }

    public static void printArr(int[] arr) {
        System.out.println("Element in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int countNum(int[] arr) {
        int result;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        result = even;
        return result;
    }

    public static void main(String[] args) {
        int n, odd, even = 0;
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        arr = inputArr(n);
        even = countNum(arr);
        odd = n - even;
        printArr(arr);
        System.out.println("Number of ood numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
    }
}
