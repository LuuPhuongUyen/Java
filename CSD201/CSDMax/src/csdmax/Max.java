/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdmax;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Max {

    public static int Max(int a, int b, int c, int d, int e) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }
        if (max < e) {
            max = e;
        }
        System.out.println("Max: " + max);
        return max;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e=in.nextInt();
        Max(a, b, c, d, e);
    }
}
