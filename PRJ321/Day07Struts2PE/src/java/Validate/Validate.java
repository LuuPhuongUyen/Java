/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

/**
 *
 * @author PC
 */
public class Validate {

    public static boolean checkString(String s){
        if (s == null || s.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean checkPhone(String s) {
        if (!s.matches("\\d{10}$")) {
            return false;
        }
        return true;
    }
}

