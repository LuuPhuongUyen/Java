/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s004pizza;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author PC
 */
public class ProducerConsumerQueue implements Serializable {

    private Queue products = new LinkedList();

    public ProducerConsumerQueue() {
    }

    public Queue getProducts() {
        return products;
    }

    public void setProducts(Queue products) {
        this.products = products;
    }

    public void provide(String product) {
        products.add(product);
    }
}
