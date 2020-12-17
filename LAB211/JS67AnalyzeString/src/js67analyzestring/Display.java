/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js67analyzestring;

import java.util.*;

/**
 *
 * @author PC
 */
public class Display {

    public boolean checkSquareNumber(int n) {
        return (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }

    public void getNumber(String inputString) {
        HashMap<String, ArrayList<Integer>> hNum = new HashMap<>();
        String number = inputString.replaceAll("\\D+", ",");
        if (number.charAt(0) == ',') {
            number = number.substring(1);
        }
        if (number.charAt(number.length() - 1) == ',') {
            number = number.substring(0, number.length() - 1);
        }
        String[] listNumber = number.split(",");
        int lenNumber = listNumber.length;
        ArrayList<Integer> perfectSquare = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();
        for (int i = 0; i < lenNumber; i++) {
            int numberCheck = Integer.parseInt(listNumber[i]);
            if (numberCheck % 2 == 1) {
                odd.add(numberCheck);
            }
            if (numberCheck % 2 == 0) {
                even.add(numberCheck);
            }
            if (checkSquareNumber(numberCheck)) {
                perfectSquare.add(numberCheck);
            }
            all.add(numberCheck);
        }
        hNum.put("Perfect Square Numbers: ", perfectSquare);
        hNum.put("Odd Numbers: ", odd);
        hNum.put("Even Numbers: ", even);
        hNum.put("All Numbers: ", all);
        for (Map.Entry m : hNum.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public void getCharacter(String inputString) {
        HashMap<String, String> hmChar = new HashMap<>();
        String uppercase = inputString.replaceAll("\\W|[0-9]|[a-z]", "");
        String lowercase = inputString.replaceAll("\\W|[0-9]|[A-Z]", "");
        String special = inputString.replaceAll("\\w", "");
        String allCharacter = inputString.replaceAll("[0-9]", "");
        hmChar.put("Uppercase: ", uppercase);
        hmChar.put("Lowercase: ", lowercase);
        hmChar.put("Special: ", special);
        hmChar.put("All Character: ", allCharacter);
        for (Map.Entry m : hmChar.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
