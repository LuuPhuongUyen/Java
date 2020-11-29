/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankDriver;

/**
 *
 * @author PC
 */
public class Account {

    private int idAcc;
    private Customer cus;
    private double balance;

    public Account() {
    }

    public Account(int idAcc, Customer cus, double balance) {
        this.idAcc = idAcc;
        this.cus = cus;
        this.balance = balance;
    }

    public Account(int id, Customer cus) {
        this.idAcc = id;
        this.cus = cus;
    }

    public int getIdAcc() {
        return idAcc;
    }

    public Customer getCus() {
        return cus;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double debit(double amount) {
        if (amount < balance) {
            balance = balance - amount;
        } else {
            System.out.println("Can't take the money.");
        }
        return balance;
    }

    public double transferTo(Account momAcc, int amount) {
        if (amount < balance) {
            momAcc.credit(amount);
            balance = balance - amount;
        } else {
            System.out.println("Can't transfer to mom.");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + "idAcc=" + idAcc + ", cus=" + cus + ", balance=" + balance + '}';
    }

}
