/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js10linearsearch;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class JS10LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinearSearch ls = new LinearSearch();
        int n = ls.sizeOfArray();
        int[] arr = ls.inputArr(n);
        ls.printArr(arr);
        System.out.print("\nEnter number to search: ");
        int search = ls.checkInputInt();
        int result = ls.linearSearch(arr, n, search);
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
