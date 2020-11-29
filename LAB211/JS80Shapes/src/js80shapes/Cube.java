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
public class Cube extends threeDimensionalShape{
    private double a;

    public Cube() {
    }

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public double getArea() {
        double resultArea = 6*a*a;
        return resultArea;
    }
    
    public double getVolume() {
        double resultVolume = a*a*a;
        return resultVolume;
    }
    
}
