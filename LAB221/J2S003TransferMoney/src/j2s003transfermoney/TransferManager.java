package j2s003transfermoney;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class TransferManager implements Runnable {

    private int transferCount = 0;
    private double amount;
    private CustomerAccount acc1 = new CustomerAccount();
    private CustomerAccount acc2 = new CustomerAccount();

    public TransferManager() {
    }

    public TransferManager(double amount, CustomerAccount acc1, CustomerAccount acc2) {
        this.amount = amount;
        this.acc1 = acc1;
        this.acc2 = acc2;
    }

    public int getTransferCount() {
        return transferCount;
    }

    public void setTransferCount(int transferCount) {
        this.transferCount = transferCount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CustomerAccount getAcc1() {
        return acc1;
    }

    public void setAcc1(CustomerAccount acc1) {
        this.acc1 = acc1;
    }

    public CustomerAccount getAcc2() {
        return acc2;
    }

    public void setAcc2(CustomerAccount acc2) {
        this.acc2 = acc2;
    }

    public void transfer(CustomerAccount acc1, CustomerAccount acc2, double amount) {
        while (acc1.getBalance() != acc2.getBalance()) {
            transferCount++;
            acc1.setBalance(acc1.getBalance() - amount);
            acc2.setBalance(acc2.getBalance() + amount);

        }
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        double balance1 = 0, balance2 = 0;
        System.out.print("Enter account type: ");
        String accType1 = sc.nextLine();
        System.out.print("Enter account balance: ");
        balance1 = sc.nextDouble();
        System.out.print("Enter account type: ");
        sc.nextLine();
        String accType2 = sc.nextLine();
        System.out.print("Enter account balance: ");
        balance2 = sc.nextDouble();
        System.out.print("Total money to transfer: ");
        amount = sc.nextDouble();
        acc1.setBalance(balance1);
        acc2.setBalance(balance2);
        acc1.setAccountType(accType1);
        acc2.setAccountType(accType2);
        System.out.println("Account balance before tranfer:");
        System.out.println(acc1.getAccountType() + ": " + acc1.getBalance());
        System.out.println(acc2.getAccountType() + ": " + acc2.getBalance());
        if (acc1.getBalance() > acc2.getBalance()) {
            transfer(acc1, acc2, amount);
            for (int i = 0; i < transferCount; i++) {
                System.out.println("Transfering " + amount + " usd from account "
                        + acc1.getAccountType() + " to account " + acc2.getAccountType());
            }
        } else if (acc1.getBalance() < acc2.getBalance()) {
            transfer(acc2, acc1, amount);
            for (int i = 0; i < transferCount; i++) {
                System.out.println("Transfering " + amount + " usd from account "
                        + acc1.getAccountType() + " to account " + acc2.getAccountType());
            }
        }
        System.out.print("Number of transfer instance: " + transferCount);
        System.out.println("\nAccount balance after tranfer:");
        System.out.println(acc1.getAccountType() + ": " + acc1.getBalance());
        System.out.println(acc2.getAccountType() + ": " + acc1.getBalance());
    }
}
