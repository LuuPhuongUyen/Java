/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2p2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class SmallestElements {

    static Scanner sc = new Scanner(System.in);

    public static int[] inputArr(int n) {
        int[] result = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }
        return result;
    }

    public static void main(String[] args) {
        int n, k;
        System.out.printf("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        arr = inputArr(n);
        System.out.printf("How many  smallest elements? ");
        k = sc.nextInt();
        System.out.printf(k + " smallest elements of the said array are: ");
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
