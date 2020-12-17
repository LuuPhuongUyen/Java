/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js1bubblesort;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class BubbleSort {

    int[] arr;
    private final Scanner in = new Scanner(System.in);

    public int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public int sizeOfArray() {
        System.out.print("Enter number of array: ");
        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine().trim());
                if (n <= 0) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Please input number greater than zero.");
                System.out.print("Enter again: ");
            }
        }
    }

    public int[] inputArr(int n) {
        arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = checkInputInt();
        }
        return arr;
    }

    public void BubbleSort(int[] arr) {
        System.out.print("Inputted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    public void printArr(int[] arr) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
