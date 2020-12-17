/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class ConcatenateString {

    public static void main(String[] args) {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("The concatenated string: " + str1.concat(str2));
    }
}
