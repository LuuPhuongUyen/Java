/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerAccount;

/**
 *
 * @author PC
 */
public class Account {

    private int id;
    private Customer cus;
    private double balance = 0.0;

    public Account() {
    }

    public Account(int id, Customer cus) {
        this.id = id;
        this.cus = cus;
    }

    public Account(int id, Customer cus, double balance) {
        this.id = id;
        this.cus = cus;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCus() {
        return cus;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return "Name: " + cus.getName();
    }

    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Amount withdraw exceeds the current balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", cus=" + cus + ", balance=" + balance
                 + '}';
    }

}
