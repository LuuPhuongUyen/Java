/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction a = new Fraction(3, 4);
        Fraction b = new Fraction(5, 6);
        Fraction c = a.divide(b);
        //c.reverse();
        System.out.println(c);
        //array, print out, sum
        Fraction f = new HonSo(2,1,5);
        System.out.println(f);
    }
}
