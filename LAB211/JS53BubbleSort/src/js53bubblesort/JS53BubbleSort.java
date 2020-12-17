/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js53bubblesort;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class JS53BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here          
        BubbleSort bs = new BubbleSort();
        int n;
        int[] arr = null;
        while (true) {
            int choice = bs.menu();
            switch (choice) {
                case 1:
                    n = bs.sizeOfArray();
                    arr = bs.inputArr(n);
                    break;
                case 2:
                    bs.BubbleSortAsc(arr);
                    break;
                case 3:
                    bs.BubbleSortDesc(arr);
                    break;
                case 4:
                    return;
            }
        }
    }
}
