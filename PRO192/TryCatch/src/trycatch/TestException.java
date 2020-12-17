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
public class TestException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So bi chia: ");
        double soBiChia = scanner.nextDouble();
        System.out.println("So chia: ");
        double soChia = scanner.nextDouble();
        double kq = soBiChia / soChia;
        System.out.printf("\nResult: %f / %f = %f\n", soBiChia, soChia, kq);
    }
}
