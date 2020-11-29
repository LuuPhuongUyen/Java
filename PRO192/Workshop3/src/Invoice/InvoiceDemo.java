/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

/**
 *
 * @author PC
 */
public class InvoiceDemo {

    public static void main(String[] args) {
        InvoiceItem inv = new InvoiceItem("P250", "Pen", 0, 0);
        inv.setQty(30);
        inv.setUnitPrice(3000);
        inv.getTotal();
        System.out.println(inv);
    }
}
