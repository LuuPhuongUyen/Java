/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fraction;

/**
 *
 * @author PC
 */
public class FractionDemo {

    public static void main(String[] args) {
        Fraction a = new Fraction(3, 4);
        Fraction b = new Fraction(5, 6);
        System.out.println(a.toString());
        System.out.println(b.toString());

        Fraction c = a.add(b);
        System.out.println(c.toString());

        c = a.subtract(b);
        System.out.println(c.toString());

        c = a.divide(b);
        System.out.println(c.toString());

        c = a.multiply(b);
        System.out.println(c.toString());
    }
}
