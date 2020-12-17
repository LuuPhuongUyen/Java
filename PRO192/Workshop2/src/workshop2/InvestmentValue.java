/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class InvestmentValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the investment amount: ");
        double investment = in.nextDouble();
        System.out.print("Input the rate of interest: ");
        double rate = in.nextDouble();
        System.out.print("Input number of years: ");
        int year = in.nextInt();
        rate *= 0.01;
        System.out.printf("Years\tFutureValue\n");
        for (int i = 1; i <= year; i++) {
            System.out.printf("%d\t%.2f\n", i, futureInvestmentValue(investment, rate / 12, i));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
