package workshop1;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, perimeter, area;
        System.out.println("Enter radius: ");
        radius = sc.nextDouble();
        perimeter = 2 * radius * Math.PI;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Perimeter: " + perimeter + "\nArea: " + area);
    }
}

