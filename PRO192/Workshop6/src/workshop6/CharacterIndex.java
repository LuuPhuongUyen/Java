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
public class CharacterIndex {

    public static void main(String[] args) {
        String str = "Workshop 6!";
        System.out.println("String: " + str);
        int index1 = str.charAt(0);
        int index2 = str.charAt(9);
        System.out.println("The character at position 0 is " + (char) index1);
        System.out.println("The character at position 9 is " + (char) index2);
    }
}
