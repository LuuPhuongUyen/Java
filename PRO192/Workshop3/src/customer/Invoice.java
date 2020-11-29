/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author PC
 */
public class Invoice {
    int Id;
    Customers Customer;
    double amount;

    public Invoice() {
    }

    public Invoice(int Id, Customers Customer, double amount) {
        this.Id = Id;
        this.Customer = Customer;
        this.amount = amount;
    }

    public int getId() {
        return Id;
    }

    public Customers getCustomer() {
        return Customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customers Customer) {
        this.Customer = Customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return Customer.getName();
    }

    public double getAmountAfterDiscount(int discount) {
        return amount * (1 - ((discount * 1.0) / 100));
    }

    @Override
    public String toString() {
        return "Invoice{" + "Id=" + Id + ", Customer=" + Customer + ", amount=" + amount + '}';
    }
}
