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
public class Book extends ShopItem {

    private double weight;

    public Book() {
    }

    public Book(double weight) {
        this.weight = weight;
    }

    public Book(double weight, String id, String iName, double iPrice, int iQtt) {
        super(id, iName, iPrice, iQtt);
        this.weight = weight;
    }

    @Override
    public void printData() {
        System.out.printf("%-5s %-10s %-15s %-7s %-9s %-5s\n", super.getId(), "Book", super.getiName(), super.getiPrice(), super.getiQtt(), weight);
    }

    @Override
    public String toString() {
        return "Book    |" + "" + weight + "|" + getId() + "|" + getiName() + "|" + getiPrice() + "|" + getiQtt();
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double transportingFee() {
        double fee = 0;
        if (weight == 0) {
            return 0;
        }
        if (weight > 0 && weight < 0.5) {
            fee = 5;
        } else if (weight < 1) {
            fee = 9.5;
        } else {
            fee = 9.5 + (int) (weight) * 7;
        }
        return fee;
    }
}
