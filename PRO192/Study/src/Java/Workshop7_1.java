/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Scanner;

/**
 *
 * @author PC
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
        if (this.a + this.b <= this.c || this.b + this.c <= this.a || this.c + this.a <= this.b) {
            throw new IllegalTriangleException("This is not a triangle!");
        }
        if ((Math.pow(this.a, 2) + Math.pow(this.b, 2) != Math.pow(this.c, 2))
                && (Math.pow(this.b, 2) + Math.pow(this.c, 2) != Math.pow(this.a, 2))
                && (Math.pow(this.c, 2) + Math.pow(this.a, 2) != Math.pow(this.b, 2))) {
            throw new IllegalRightTriangleException("This is not a right triangle!");
        }
    }
}

public class Workshop7_1 {

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
                //call constructor of RightTriangle class
                RightTriangle temp = new RightTriangle(a, b, c);
                System.out.println("This is a right triangle!");
            } catch (IllegalTriangleException e1) {
                System.out.println("This is not a triangle!");
            } catch (IllegalRightTriangleException e2) {
                System.out.println("This is not a right triangle");
            }
            //continue?
            System.out.print("Continue?(Y/N):");
            //Enter a character
            char chon = sc.next().charAt(0);
            if (chon != 'Y') {
                break;
            }
        }
    }
}