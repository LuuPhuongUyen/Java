/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdstack;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class CSDStack {

    int[] s;
    int top = -1;
    int max = 100;

    CSDStack(int m) {
        max = m;
        s = new int[max];
        top = -1;
    }

    void inputStack() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            push(x);
        }
    }

    void output() {
        System.out.println("Stack: ");
        while (top >= 0) {
            int x = pop();
            System.out.println(x);
        }
    }

    void clear() {
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == max - 1;
    }

    void push(int x) {
        if (isFull()) {
            System.err.println("Full Stack!");
        } else {
            top++;
            s[top] = x;
        }
    }

    int pop() {
        int x = -1;
        if (isEmpty()) {
            System.err.println("Empty Stack!");
        } else {
            x = s[top];
            top--;
        }
        return x;
    }

    void decToBin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int x = sc.nextInt();
        if (x == 0) {
            System.out.println("Binary: 0000");
        } else {
            while (x != 0) {
                push(x % 2);
                x /= 2;
            }
            System.out.print("Binary: ");
            while (!isEmpty()) {
                System.out.print(pop());
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDStack S = new CSDStack(100);
//        S.inputStack();
//        S.output();
//        S.pop();
//        S.output();
        for (int i = 1; i <= 5; i++) {

            S.push(i);

            System.out.print(S.pop());

        }
        S.decToBin();
    }
}
