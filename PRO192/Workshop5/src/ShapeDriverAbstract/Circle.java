/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeDriverAbstract;

/**
 *
 * @author PC
 */
public class Circle extends Shape {

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double rs;
        rs = 2 * Math.PI * radius;
        return rs;
    }

    @Override
    public double getArea() {
        double rs;
        rs = Math.PI * radius * radius;
        return rs;
    }

    @Override
    public String toString() {
        return "Circle{Radius: " + radius + ", Color: " + color + ", Perimeter: " + getPerimeter() + ", Area: " + getArea() + "}";
    }
}
