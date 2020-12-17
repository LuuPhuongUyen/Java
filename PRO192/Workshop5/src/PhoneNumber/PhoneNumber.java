/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneNumber;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class PhoneNumber {

    int area;
    String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.area + "-" + this.number;
    }

    public PhoneNumber inputData() {
        System.out.print("Enter area code: ");
        area = Validation.checkInputInt();
        Validation.in.nextLine();
        System.out.print("Enter number: ");
        number = Validation.checkInputString().trim();
        return this;
    }

    void display() {
        System.out.printf("%d - %s\n", area, number);
    }
}
