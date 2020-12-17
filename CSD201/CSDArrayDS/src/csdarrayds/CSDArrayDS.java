/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdarrayds;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CSDArrayDS {

    int[] arr;
    int size;
    static int max = 100;

    public void inputArr() {
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
    }

    public void printArray() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int getFirst() {
        System.out.println("First element: " + arr[0]);
        return arr[0];
    }

    int getLast() {
        return arr[size - 1];
    }

    public void insert(int pos, int x) {
        int i;
        if (pos >= 0 && pos <= size) {
            size++;
            for (i = size - 1; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = x;
        } else {
            System.err.println("Invalid position");
        }
        printArray();
    }

    public int search(int k) {
        int found = -1, i;
        for (i = 0; i < size; i++) {
            if (arr[i] == k) {
                found = i;
                break;
            }
        }
        if (found != -1) {
            System.out.printf("%d found at position: ", k);
            for (i = 0; i < size; i++) {
                if (arr[i] == k) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("" + k + " not found");
        }
        return 0;
    }

    public void removePos(int pos) {
        if (pos >= 0 && pos <= size) {
            for (int i = pos; i < size; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        } else {
            System.err.println("Invalid position");
        }

    }

    public void removeValue(int k) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == k) {
                removePos(i);
                i--;
            }
        }
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            count++;
        }
        System.out.println("\nSize of array: " + count);
        return count;
    }

    public void reverse() {
        int t;
        for (int i = 0; i < size / 2; i++) {
            t = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = t;
        }
        System.out.print("\nReversed array: ");
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDArrayDS a = new CSDArrayDS();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        a.size = sc.nextInt();
        a.arr = new int[max];
        a.inputArr();
        a.printArray();
        System.out.print("\nEnter position to insert: ");
        int pos = sc.nextInt();
        System.out.print("Enter number to insert: ");
        int x = sc.nextInt();
        a.insert(pos, x);
        System.out.print("\nEnter position to remove: ");
        int pRe = sc.nextInt();
        a.removePos(pRe);
        a.printArray();
        System.out.print("\nEnter number to search: ");
        int k = sc.nextInt();
        a.search(k);
        System.out.print("\nEnter element to remove: ");
        int r = sc.nextInt();
        a.removeValue(r);
        a.printArray();
        a.size();
        a.reverse();
    }
}
