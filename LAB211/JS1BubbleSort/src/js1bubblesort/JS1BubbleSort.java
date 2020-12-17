/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js1bubblesort;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class JS1BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BubbleSort bs = new BubbleSort();
        int n = bs.sizeOfArray();
        int[] arr = bs.inputArr(n);
        bs.BubbleSort(arr);
        bs.printArr(arr);
    }

}
