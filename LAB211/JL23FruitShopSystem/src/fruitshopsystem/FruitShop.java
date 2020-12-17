/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitshopsystem;

import java.util.ArrayList;

/**
 *
 * @author HaiTr
 */
public class FruitShop {

    ArrayList<Fruit> fruitList = new ArrayList<>();

    public void addFruit(Fruit fruit) {
        fruitList.add(fruit);
    }

    public void viewFruitShop() {
        System.out.printf("%-3s | %-10s | %-10s | %-7s | %-7s\n", "ID", "Product", "Quantity", "Price", "Origin");
        for (Fruit fruit : fruitList) {
            fruit.display();
        }
    }

    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    public int checkExistID(String ID) {
        for (int i = 0; i < fruitList.size(); i++) {
            if (fruitList.get(i).getfID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }
}
