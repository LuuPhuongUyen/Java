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
public class Fraction {

    private int numer, denom;

    public Fraction() {
        denom = 1;
    }

    public Fraction(int numer, int denom) {
        if (denom == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numer = numer;
        this.denom = denom;
    }

    public Fraction(int m) {
        this(m, 1);
    }

    public Fraction(Fraction x) {
        this(x.numer, x.denom);
    }

    private int findGCD() {
        int a = Math.abs(numer), b = Math.abs(denom);
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public Fraction simplify() {
        int gcd = findGCD();
        numer /= gcd;
        denom /= gcd;
        return this;
//return new Fraction(numer/= gcd, denom/= gcd);
    }

    public Fraction add(Fraction x) {
        return new Fraction(numer * x.denom + denom * x.numer, denom * x.denom).simplify();
    }

    public static Fraction add(Fraction p, Fraction q) {
        return p.add(q);
    }

    public Fraction substract(Fraction x) {
        return this.add(new Fraction(-x.numer, x.denom));
    }

    public Fraction multiply(Fraction x) {
        return new Fraction(numer * x.numer, denom * x.denom).simplify();
    }

    public Fraction divide(Fraction x) {
        //return this.multiply(new Fraction(x.denom, x.numer));
        return this.multiply(x.reverse());
    }

    public Fraction reverse() {
        int t = numer;
        numer = denom;
        denom = t;
        return this;
    }

//    public static Fraction reverse(Fraction x) {
//        return new Fraction(x.denom, x.numer);
//    }
    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    @Override
    public String toString() {
        return (Integer.toString(numer) + "/" + Integer.toString(denom));
    }
}
