/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js4quicksort;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class JS4QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuickSort qs = new QuickSort();
        int n = qs.sizeOfArray();
        int[] arr = qs.inputArr(n);
        qs.quickSort(arr, 0, n - 1);
        qs.printArr(arr);
    }
}
