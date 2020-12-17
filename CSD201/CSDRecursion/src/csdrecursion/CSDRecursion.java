/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdrecursion;

/**
 *
 * @author PC
 */
public class CSDRecursion {

    long fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    void printFib(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    void convert(int n) {
        if (n == 0) {
            System.out.println("0");

        } else {
            convert(n / 2);
            System.out.print(n % 2);
        }
    }

    void Hanoi(int n, char from, char to, char inter) {
        if (n == 1) // Stopping condition
        {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            Hanoi(n - 1, from, inter, to);
            System.out.println("Disk " + n + " from " + from + " to " + to);
            Hanoi(n - 1, inter, to, from);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDRecursion r = new CSDRecursion();
        long x = r.fac(50);
        System.out.println(x);
        System.out.println(r.fib(4));
        r.printFib(10);
        System.out.println("");
        r.convert(2);
        System.out.println("The Tower of Hanoi:");
        r.Hanoi(3, 'A', 'C', 'B');
    }
}
