/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvoiceAccount;

/**
 *
 * @author PC
 */
public class Invoice {

    private int id;
    private Customer cus;
    private double amount;

    public Invoice() {
    }

    public Invoice(int id, Customer cus, double amount) {
        this.id = id;
        this.cus = cus;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCus() {
        return cus;
    }

    public double getAmount() {
        return amount;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return "Name: " + cus.getName();
    }

    public double getAmountAfterDiscount() {
        return amount - amount * cus.getDiscount() / 100;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", Cus=" + cus + ", Amount=" + amount+ ", Amount after discount="+getAmountAfterDiscount()+ '}';
    }
    
}
