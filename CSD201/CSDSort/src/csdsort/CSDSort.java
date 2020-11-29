/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdsort;

import java.util.Random;

/**
 *
 * @author PC
 */
public class CSDSort {

    int arr[];
    int n; //size

    CSDSort() {
    }

    CSDSort(int m) {
        n = m;
        arr = new int[n];
    }

    void input() {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(10); //0-9
        }
    }

    void output() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void swap(int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    void selectionSort() {
        int k, min;
        for (int i = 0; i < n - 1; i++) {
            min = arr[i];
            k = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    k = j;
                    min = arr[j];
                }
            }
            if (k != i) {
                swap(i, k);
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    void bubbleSort() {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    void quickSort(int f, int l) {
        if (f < l) {
            int up = f;
            int down = l;
            int x = arr[(f + l) / 2];
            do {
                while (arr[up] < x) {
                    up++;
                }
                while (arr[down] > x) {
                    down--;
                }
                if (up <= down) {
                    swap(up, down);
                    up++;
                    down--;
                }
            } while (up <= down);
            quickSort(f, down);
            quickSort(up, l);
        }
    }

    void merge(int down, int mid, int up) {
        int i, j, k;
        int[] b = new int[arr.length];
        for (i = 0; i < n; i++) {
            b[i] = arr[i];
        }
        i = down;
        j = mid + 1;
        k = down;
        while (i <= mid && j <= up) {
            if (b[i] > b[j]) {
                arr[k++] = b[j++];
            } else {
                arr[k++] = b[i++];
            }
        }
        while (i <= mid) {
            arr[k++] = b[i++];
        }
        while (j <= up) {
            arr[k++] = b[j++];
        }
    }

    void mergeSort(int down, int up) {
        if (down < up) {
            int k = (down + up) / 2;
            mergeSort(down, k);
            mergeSort(k + 1, up);
            merge(down, k, up);
        }
    }

    void heapSort() {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(i, 0);
            heapify(i, 0);
        }
    }

    void heapify(int size, int x) {
        int largest = x;
        int l = 2 * x + 1;
        int r = 2 * x + 2;
        if (l < size && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < size && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != x) {
            swap(x, largest);
            heapify(size, largest);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDSort S = new CSDSort(10000);
        long begin, end, duration;
        S.input();
        System.out.print("Array of " + S.n + " elements");
//        S.output();
        begin = System.currentTimeMillis();
        S.selectionSort();
        end = System.currentTimeMillis();
        duration = end - begin;
//        System.out.print("\nSelection sort: ");
//        S.output();
        System.out.print("\nDuration of selection sort: " + duration + "ms");
        S.input();
        begin = System.currentTimeMillis();
        S.insertionSort();
        end = System.currentTimeMillis();
        duration = end - begin;
//        System.out.print("\nInsertion sort: ");
//        S.output();
        System.out.print("\nDuration of insertion sort: " + duration + "ms");
        S.input();
        begin = System.currentTimeMillis();
        S.bubbleSort();
        end = System.currentTimeMillis();
        duration = end - begin;
//        System.out.print("\nBubble sort: ");
//        S.output();
        System.out.print("\nDuration of bubble sort: " + duration + "ms");
        S.input();
        begin = System.currentTimeMillis();
        S.quickSort(0, S.n - 1);
        end = System.currentTimeMillis();
        duration = end - begin;
//        System.out.print("\nQuick sort: ");
//        S.output();
        System.out.print("\nDuration of quick sort: " + duration + "ms");
        S.input();
        begin = System.currentTimeMillis();
        S.mergeSort(0, S.n - 1);
        end = System.currentTimeMillis();
        duration = end - begin;
//        System.out.print("\nMerge sort: ");
//        S.output();
        System.out.print("\nDuration of merge sort: " + duration + "ms");
        S.input();
        begin = System.currentTimeMillis();
        S.heapSort();
        end = System.currentTimeMillis();
        duration = end - begin;
//        System.out.print("\nHeap sort: ");
//        S.output();
        System.out.println("\nDuration of heap sort: " + duration + "ms");
    }
}
