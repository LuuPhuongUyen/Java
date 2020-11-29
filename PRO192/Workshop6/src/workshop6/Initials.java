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
public class Initials {

    static String firstLetterWord(String str) {
        String result = "";
        boolean v = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                v = true;
            } else if (str.charAt(i) != ' ' && v == true) {
                if (Character.isLowerCase(str.charAt(i))) {
                    result = "First letter word must be uppercase!";
                } else {
                    result += (str.charAt(i));
                }
                v = false;
            }
        }
        return result.toUpperCase();
    }

    public static void main(String[] args) {
        String str = "Luu Phuong Uyen";
        System.out.println(firstLetterWord(str));
    }
}
