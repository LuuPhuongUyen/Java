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
public class Fraction {

    private int numer;
    private int denom;

    public Fraction() {
    }

    public Fraction(int numer, int denom) {
        if (denom == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numer = numer;
        this.denom = denom;
    }

    void simplify() {
        int gcd = findGCD(numer, denom);
        numer /= gcd;
        denom /= gcd;
    }

    int findGCD(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    Fraction add(Fraction x) {
        Fraction rs;
        if (denom == x.denom) {
            rs = new Fraction(x.numer + numer, denom);
        } else {
            int den = denom * x.getDenom();
            int num = numer * x.getDenom() + denom * x.getNumer();
            rs = new Fraction(num, den);
            rs.simplify();
        }
        return rs;
    }

    Fraction subtract(Fraction x) {
        Fraction rs;
        if (denom == x.denom) {
            rs = new Fraction(numer - x.numer, denom);
        } else {
            int den = denom * x.getDenom();
            int num = numer * x.getDenom() - denom * x.getNumer();
            rs = new Fraction(num, den);
            rs.simplify();
        }
        return rs;
    }

    Fraction multiply(Fraction x) {
        Fraction rs;
        if (denom == x.denom) {
            rs = new Fraction(numer - x.numer, denom);
        } else {
            int den = denom * x.getNumer();
            int num = numer * x.getDenom();
            rs = new Fraction(num, den);
            rs.simplify();
        }
        return rs;
    }

    Fraction divide(Fraction x) {
        Fraction rs;
        if (denom == x.denom) {
            rs = new Fraction(numer + x.numer, denom);
        } else {
            int den = denom * x.getDenom();
            int num = numer * x.getNumer();
            rs = new Fraction(num, den);
            rs.simplify();
        }
        return rs;
    }

    public boolean equals(Fraction x) {
        boolean rs = false;
        if (numer == x.numer && denom == x.denom) {
            return true;
        }
        return rs;
    }

    public String toString() {
        return (Integer.toString(numer) + "/" + Integer.toString(denom));
    }
}
