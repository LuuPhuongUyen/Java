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
public class InvoiceAccount {

    public static void main(String[] args) {
        Customer cus1 = new Customer(123, "An", 30);
        Invoice An = new Invoice(1231, cus1, 500);
        cus1.setDiscount(30);
        System.out.println(An);
    }
}
