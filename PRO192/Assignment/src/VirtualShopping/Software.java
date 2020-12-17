/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualShopping;

/**
 *
 * @author PC
 */
public class Software extends ShopItem {

    private int noCD;

    public Software() {
    }

    public Software(int noCD) {
        this.noCD = noCD;
    }

    public Software(int noCD, String id, String iName, double iPrice, int iQtt) {
        super(id, iName, iPrice, iQtt);
        this.noCD = noCD;
    }

    @Override
    public String toString() {
        return "Software|" + "" + noCD + "  |" + getId() + "|" + getiName() + "|" + getiPrice() + "|" + getiQtt();
    }

    @Override
    public void printData() {
        System.out.printf("%-5s %-10s %-15s %-7s %-9s %-5s\n", super.getId(), "Software", super.getiName(), super.getiPrice(), super.getiQtt(), noCD);
    }

    @Override
    public int getNoCD() {
        return noCD;
    }

    public void setNoCD(int noCD) {
        this.noCD = noCD;
    }

    @Override
    public double transportingFee() {
        double fee = 0;
        if (noCD <= 3) {
            fee = 3.25 * noCD;
        } else {
            fee = 3.25 * 3 + (noCD - 3) * 1.50;
        }
        return fee;
    }
}
