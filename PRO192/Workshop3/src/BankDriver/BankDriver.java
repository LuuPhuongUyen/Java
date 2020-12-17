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
public class BankDriver {

    public static void main(String[] args) {
        Customer cus1 = new Customer(123, "An", 'M');
        Customer cus2 = new Customer(110, "Mom", 'F');
        Account accAn = new Account(572, cus1, 7000);
        Account accMom = new Account(987, cus2, 0);
        accAn.transferTo(accMom, 8000);
        System.out.println(accAn);
        System.out.println(accMom);

    }
}
