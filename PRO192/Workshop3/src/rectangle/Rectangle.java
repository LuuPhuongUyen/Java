/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.util.Scanner;

class Rectangle {

    private static Scanner sc = new Scanner(System.in);
    private float width;
    private float height;

    public void Input() {
        System.out.print("Width : ");
        width = sc.nextFloat();
        System.out.print("Height : ");
        height = sc.nextFloat();
    }

    public float CalculateArea() {
        return height * width;
    }

    public float CalculatePerimeter() {
        return (height + width) * 2;
    }

    public void Display() {
        System.out.println("Area : " + CalculateArea());
        System.out.println("Perimeter : " + CalculatePerimeter());
    }
}
