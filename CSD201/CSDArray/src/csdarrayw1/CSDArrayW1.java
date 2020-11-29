/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdarrayw1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CSDArrayW1 {

    /**
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

    public static void printArr(int[] arr) {
        System.out.print("Element in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static float oddEven(int[] arr) {
        int sum = 0;
        float avg = 0;
        int even = 0;
        System.out.print("Odd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(" " + arr[i]);
            } else {
                sum += arr[i];
                even++;
            }
        }
        if (even != 0) {
            avg = sum / even;
        } else {
            System.out.println("None even number");
        }
        System.out.println("\nAverage of even numbers: " + avg);
        return avg;
    }

    public static int range(int[] arr) {
        System.out.println("Enter min of range: ");
        int min = sc.nextInt();
        System.out.println("Enter max of range: ");
        int max = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                count++;
            }
        }
        System.out.printf("In range: " + count);
        return count;
    }

    public static int search(int[] arr) {
        System.out.print("\nEnter number to search: ");
        int k = sc.nextInt();
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.printf("%d found at position %d\n", k, i);
            }
        }
        return 0;
    }

    public static int reverse(int[] arr) {
        int i, k, t, n = arr.length;
        for (i = 0; i < n / 2; i++) {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }
        System.out.println("Reversed array: ");
        for (k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
        return 0;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr = inputArr(n);
        printArr(arr);
        oddEven(arr);
        range(arr);
        search(arr);
        reverse(arr);
    }
}
