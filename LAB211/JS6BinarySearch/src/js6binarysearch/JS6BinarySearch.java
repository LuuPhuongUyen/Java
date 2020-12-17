/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js6binarysearch;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class JS6BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearch bs = new BinarySearch();
        int n = bs.sizeOfArray();
        int[] arr = bs.inputArr(n);
        bs.BubbleSort(arr);
        bs.printArr(arr);
        System.out.print("\nEnter number to search: ");
        int search = bs.checkInputInt();
        int result = bs.binarySearch(arr, 0, n - 1, search);
        if (result == -1) {
            System.err.printf("%d not found", search);
        } else {
            System.out.printf("%d found at position: ", search);
            for (int i = 0; i < n; i++) {
                if (arr[i] == search) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
