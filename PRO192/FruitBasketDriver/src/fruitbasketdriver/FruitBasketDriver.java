/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitbasketdriver;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author PC
 */
public class FruitBasketDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Fruit> fruitBasket = new ArrayList<Fruit>();
        fruitBasket.add(new Fruit(111, "Apple", "China"));
        fruitBasket.add(new Fruit(114, "Orange", "Vietnam"));
        fruitBasket.add(new Fruit(113, "Grape", "China"));
        System.out.println(fruitBasket);
        for (int i = 0; i < fruitBasket.size(); i++) {
            if (fruitBasket.get(i).getOrigin().equalsIgnoreCase("vietnam")) {
                System.out.println(fruitBasket.get(i));
            }
        }
        for (Fruit frt : fruitBasket) {
            System.out.println(frt);
        }
        ListIterator iterator = fruitBasket.listIterator();
        System.out.println("forward");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("backward");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous() + " ");
        }
        System.out.println();
        //sort
        Collections.sort(fruitBasket);
        System.out.println(fruitBasket);
    }

}
