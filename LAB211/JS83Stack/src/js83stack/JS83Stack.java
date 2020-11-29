/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js83stack;

import java.util.*;

/**
 *
 * @author LuuPhuongUyen SE1401
 */
public class JS83Stack {

    int[] s;
    int top = -1;
    int max = 100;

    JS83Stack(int m) {
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
        return s[top + 1];
    }

    public int get() {
        if (isEmpty()) {
            System.err.println("Empty Stack!");
        }
        return s[top];
    }

    public static void main(String[] args) {
        // TODO code application logic here
        JS83Stack S = new JS83Stack(100);
        S.inputStack();
        S.output();
        S.push(12);
        System.out.println(S.get());
        System.out.println("The topmost element from the stack: " + S.pop());
    }
}
