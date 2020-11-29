/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String message) {
        super(message);
    }
}

class IllegalRightTriangleException extends Exception {

    public IllegalRightTriangleException(String message) {
        super(message);
    }
}

class RightTriangle {

    int a, b, c;

    public RightTriangle(int a, int b, int c) throws IllegalTriangleException, IllegalRightTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        if (this.a < 0 || this.b < 0 || this.c < 0) {
            throw new IllegalTriangleException("This is not a triangle!");
        }
        if (a + b <= c || b + c <= a || a + c <= b || a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("This is not a triangle!");
        }
        if ((a * a + b * b != c * c) && (b * b + c * c != a * a) && (a * a + c * c != b * b)) {
            throw new IllegalRightTriangleException("This is not a right triangle!");
        }
    }
}

public class Triangle {

    /**
     * @param args the command line arguments
     */
    static int enterNumber() throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        try {
            number = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            throw new Exception("Wrong input! Try again!");
        }
        return number;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter side a: ");
                a = enterNumber();
                System.out.print("Enter side b: ");
                b = enterNumber();
                System.out.print("Enter side c: ");
                c = enterNumber();
            } catch (Exception e) {
                System.out.println("Wrong input! Try again!");
                continue;
            }
            try {
                RightTriangle temp = new RightTriangle(a, b, c);
                System.out.println("This is a right triangle!");
            } catch (IllegalTriangleException e1) {
                System.out.println("This is not a triangle!");
            } catch (IllegalRightTriangleException e2) {
                System.out.println("This is not a right triangle");
            }
            System.out.print("Continue?(Y/N):");
            char choice = sc.next().charAt(0);
            if (choice != 'Y' && choice != 'y') {
                break;
            }
        }
    }
}
