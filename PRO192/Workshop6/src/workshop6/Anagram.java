/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

import java.util.Arrays;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class Anagram {

    public static void main(String[] args) {
        String s1 = "parliament";
        String s2 = "partial men";
        boolean anagram = new Anagram().isAnagram(s1, s2);
        System.out.println(anagram);
    }

    public boolean isAnagram(String s1, String s2) {
        char[] x = removeDotSpace(s1).toCharArray();
        char[] y = removeDotSpace(s2).toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        String sortX = new StringBuilder().append(x).toString();
        String sortY = new StringBuilder().append(y).toString();
        return sortX.equals(sortY);
    }

    private String removeDotSpace(String x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            char at = x.charAt(i);
            if (at == ' ' || at == '.') {
                continue;
            }
            sb.append(at);
        }
        return sb.toString();
    }
}
