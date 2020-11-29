/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js80shapes;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author ADMIN
 */
public class Triangle extends twoDimensionalShape {

    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double p = (a + b + c) / 2;
        double result;
        result = Double.parseDouble(formatter.format(Math.sqrt(p * (p - a) * (p - b) * (p - c))));

        return result;
    }

}
