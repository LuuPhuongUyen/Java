/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atoms;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class Atoms {
    public  static Scanner input = new Scanner(System.in);
    private int number;
    private String symbol;
    private String fullName;
    private float weight;

    public Atoms() {
    }

    public Atoms(int number, String symbol, String fullName, float weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullName = fullName;
        this.weight = weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    
    public Atoms enterData() {
        System.out.print("Enter number: ");
        number = Validation.checkInputInt();
        if (number==0) System.exit(0);
        input.nextLine();
        System.out.print("Enter symbol: ");
        symbol = Validation.checkInputString();
        System.out.print("Fullname: ");
        fullName = Validation.checkInputString();
        System.out.print("Weight: ");
        weight = Validation.checkInputFloat();        
        Atoms atom = new Atoms(number, symbol, fullName, weight);
        return atom;
    }

    void Display() {
        System.out.printf("%-10d%-10s\t%-10s\t%-10f\n", number, symbol, fullName, weight); 
    }
}
