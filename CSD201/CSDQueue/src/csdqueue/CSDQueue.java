/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdqueue;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class CSDQueue {

    int[] Q;
    int max;
    int f, l;

    CSDQueue(int m) {
        max = m;
        Q = new int[max];
        f = 0;
        l = 0;
    }

    int count() {
        int x = l - f;
        return x;
    }

    boolean isEmpty() {
        return count() == 0;
    }

    boolean isFull() {
        return count() == max;
    }

    void enqueue(int x) {
        if (isFull()) {
            System.err.println("Full queue!");
        } else {
            Q[l] = x;
            l = (l + 1) % max;
        }
    }

    int dequeue() {
        int x = -1;
        if (isEmpty()) {
            System.err.println("Empty queue!");
        } else {
            x = Q[f];
            f = (f + 1) % max;
        }
        return x;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            enqueue(x);
        }
    }

    void output() {
        System.out.println("Queue: ");
        while (count() > 0) {
            int x = dequeue();
            System.out.println(x);
        }
    }

    void grow() {
        int i, j;
        int[] Q1 = new int[max];
        int t = f;
        for (i = f; i < l; i++) {
            Q1[i - f] = Q[i];
        }
        Q = Q1;
        f = 0;
        l = l - t;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDQueue Q = new CSDQueue(5);
        Q.input();
       System.out.println(Q.dequeue());
//        Q.grow();
//        Q.enqueue(7);
     //   Q.output();
    }
}
