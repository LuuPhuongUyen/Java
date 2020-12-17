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
public class CustomerAccount {
    public static void main(String[] args) {
        Customer cus1 = new Customer(123, "An", 'M');
        Customer cus2 = new Customer(123, "Na", 'F');
        Account accAn = new Account(999, cus1, 4000);
        Account accNa = new Account(333, cus2, 7000);
        accAn.deposit(4000);
        accNa.withdraw(5000);
        System.out.println(accAn);
        System.out.println(accNa);

    }
}
