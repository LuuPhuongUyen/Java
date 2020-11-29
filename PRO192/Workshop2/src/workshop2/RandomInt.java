/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class RandomInt {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the starting number of the range: ");
        int rsnum = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int renum = sc.nextInt();
        if (renum <= rsnum) {
            System.out.println("Ending number must be greater than starting number!");
        } else {
            int random_num = rsnum + (int) (Math.random() * ((renum - rsnum) + 1));
            System.out.println(random_num);
        }
    }
}
