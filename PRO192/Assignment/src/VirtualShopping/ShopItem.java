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
public class ShopItem implements Cloneable, Iitem, Comparable<ShopItem> {

    private String id;
    private String iName;
    private double iPrice;
    private int iQtt;

    public ShopItem() {
    }

    public ShopItem(String id, String iName, double iPrice, int iQtt) {
        this.id = id;
        this.iName = iName;
        this.iPrice = iPrice;
        this.iQtt = iQtt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public double getiPrice() {
        return iPrice;
    }

    public void setiPrice(double iPrice) {
        this.iPrice = iPrice;
    }

    public int getiQtt() {
        return iQtt;
    }

    public void setiQtt(int iQtt) {
        this.iQtt = iQtt;
    }

    @Override
    public double transportingFee() {
        ShopItem n = new ShopItem();
        double fee = 0;
        return 0;
    }

//    public double total() {
//        return iQtt * iPrice;
//    }
    @Override
    public int compareTo(ShopItem o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ShopItem{" + "id=" + id + ", iName=" + iName + ", iPrice=" + iPrice + ", iQtt=" + iQtt + '}';
    }

    public void printData() {
        System.out.printf(" %-5s %-15s %-5s %-8s\n", id, iName, iPrice, iQtt);
    }

    public double getWeight() {
        return 0;
    }

    public int getNoCD() {
        return 0;
    }
}
