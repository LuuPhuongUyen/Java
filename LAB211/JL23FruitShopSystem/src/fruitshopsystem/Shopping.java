/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitshopsystem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class Shopping {

    private HashMap<String, ArrayList<Fruit>> orders = new HashMap<>();

    public Shopping() {

    }

    public HashMap<String, ArrayList<Fruit>> getOrders() {
        return orders;
    }

    public void addOrders(Customer customer) {
        orders.put(customer.getCustomerName(), customer.getCart());
    }

}
