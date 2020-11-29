/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("So bi chia: ");
            int soBiChia = scanner.nextInt();
            System.out.println("So chia: ");
            int soChia = scanner.nextInt();
            int kq = soBiChia / soChia;
            System.out.printf("\nResult: %d / %d = %d\n", soBiChia, soChia, kq);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
    }

}
