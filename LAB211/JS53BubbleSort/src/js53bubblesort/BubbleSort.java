/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js53bubblesort;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class BubbleSort {

    int[] arr;
    private final Scanner in = new Scanner(System.in);

    public int menu() {
        System.out.println("\n|-------------------------------|");
        System.out.println("|      Bubble Sort program      |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1. Input Element.             |");
        System.out.println("| 2. Sort Ascending.            |");
        System.out.println("| 3. Sort Descending.           |");
        System.out.println("| 4. EXIT.                      |");
        System.out.println("---------------------------------");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 4);
        return choice;
    }

    public int checkInputIntLimit(int min, int max) {

        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be double");
                System.out.print("Enter again: ");
            }
        }
    }

    public int sizeOfArray() {
        System.out.print("Enter number of array: ");
        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine().trim());
                if (n < 0) {
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
        System.out.print("Inputted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public void BubbleSortAsc(int[] arr) {
        if (arr.length == 0) {
            System.err.println("List empty.");
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
        System.out.print("Ascending sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void BubbleSortDesc(int[] arr) {
        if (arr.length == 0) {
            System.err.println("List empty.");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.print("Descending sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
