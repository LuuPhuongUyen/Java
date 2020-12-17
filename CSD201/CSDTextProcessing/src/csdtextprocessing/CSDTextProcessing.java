/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdtextprocessing;

/**
 *
 * @author PC
 */
public class CSDTextProcessing {

    int BruteForce(String s, String p) {
        int i, j = 0;
        int sLength = s.length();
        int pLength = p.length();
        for (i = 0; i < sLength - pLength; i++) {
            while ((j < pLength) && (s.charAt(i + j) == p.charAt(j))) {
                j++;
            }
            if (j == pLength) {
                return i;
            }
        }
        return -1;
    }

    int lps(String p) {
        int m = p.length();
        int LPS[] = new int[m];
        int len = 0;
        int i = m / 2;
        LPS[0] = 0;
        while (i < m) {
            if (p.charAt(i) == p.charAt(len)) {
                len++;
                i++;
                LPS[len] = len;
            } else {
                if (len != 0) {
                    len = LPS[len - 1];
                } else {
                    LPS[i] = len;
                    i++;
                }
            }
        }
        return len;
    }

    void kmp(String s, String p) {
        int m = p.length();
        int n = s.length();
        int LPS[] = new int[m];
        LPS[0] = lps(p);
        int i = 0, j = 0;
        while (i < n) {
            if (p.charAt(j) == s.charAt(i)) {
                j++;
                i++;
            }
            if (j == m) {
                System.out.println(p +" found" + " at position " + (i - j));
                j = LPS[j - 1];
            } else if (i < n && p.charAt(j) != s.charAt(i)) {
                if (j != 0) {
                    j = LPS[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDTextProcessing T = new CSDTextProcessing();
        String s = "abcabcabc";
        String p = "abc";
        System.out.println("Brute-force:");
        int pos = T.BruteForce(s, p);
        if (pos == -1) {
            System.err.println("Not matched!");
        } else {
            System.out.println(p + " found at position " + pos + " in " + s);
        }
        System.out.println("Longest prefix surfix: "+T.lps(s));
        System.out.println("KMP:");
        T.kmp(s, p);
    }
}
