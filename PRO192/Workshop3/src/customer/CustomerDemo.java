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
public class CustomerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customers cus1 = new Customers(4357, "Nguyen Van An", 15);
        Customers cus2 = new Customers(4457, "Le Thi C", 10);
        Invoice no1 = new Invoice(5656, cus1, 2000);
        Invoice no2 = new Invoice(2326, cus2, 1000);

        no2.setAmount(5000);

        System.out.println(no1);
        System.out.println(no2);
        System.out.println("name of customer: " + no2.getCustomerName());
        System.out.println("After discount, the amount is:" + no2.getAmountAfterDiscount(cus1.getDiscount()));

    }
}
