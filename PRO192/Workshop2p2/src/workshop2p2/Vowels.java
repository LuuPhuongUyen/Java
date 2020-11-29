/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2p2;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen Se1401
 */
public class Vowels {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = in.nextLine();
        System.out.println("The number of vowels: " + countVowels(str));
    }

    public static int countVowels(String str) {
        int i, count = 0;
        for (i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
                count += 1;
            }
        }
        return count;
    }
}
