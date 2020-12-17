/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2p2;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class AverageOfThree {

    public static double Average(double x, double y, double z) {
        double result;
        result = (x + y + z) / 3;
        return result;
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Input three numbers: ");
        num1 = number.nextDouble();
        num2 = number.nextDouble();
        num3 = number.nextDouble();
        double result = Average(num1, num2, num3);
        System.out.println("Average of three numbers = " + result);
        
    }
}
