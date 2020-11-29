/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js80shapes;

/**
 *
 * @author ADMIN
 */
public class Circle extends twoDimensionalShape {

    private double r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getArea() {
        double result = 3.14 * r * r;
        return result;
    }

}
