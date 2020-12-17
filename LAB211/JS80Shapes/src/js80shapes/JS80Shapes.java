/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js80shapes;

/**
 *
 * @author PC
 */
public class JS80Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--- Two Dimensional Shape ---");
        Shape circle = new Circle(2);
        System.out.println("Area Circle : " + circle.getArea());

        Shape square = new Square(2);
        System.out.println("Area Square : " + square.getArea());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Area Triangle : " + triangle.getArea());

        System.out.println("--- Three Dimensional Shape ---");

        Shape sphere = new Sphere(2);
        System.out.println("Area Sphere : " + sphere.getArea());
        System.out.println("Volume Sphere : " + sphere.getVolume());

        Shape cube = new Cube(2);
        System.out.println("Area Cube : " + cube.getArea());
        System.out.println("Volume Cube : " + cube.getVolume());

        Shape tetraheron = new Tetrahedron(90);
        System.out.println("Area Sphere : " + tetraheron.getArea());
        System.out.println("Volume Sphere : " + tetraheron.getVolume());
    }

}
