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
public class Sphere extends threeDimensionalShape{
    
    private double r;

    public Sphere() {
    }

    public Sphere(int r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getArea() {
        double resultArea = 4*(3.14*r*r);
        return resultArea;
    }
    
     public double getVolume() {
        
        NumberFormat formatter = new DecimalFormat("#0.00");
        double resultVolume = Double.parseDouble(formatter.format(4 * r * r * r * Math.PI / 3));
        return resultVolume;
    }

    
}
