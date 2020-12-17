/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s004pizza;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Producer extends Thread {

    private ProducerConsumerQueue q;
    private String pizzaList;

    public Producer() {
    }

    public Producer(ProducerConsumerQueue q, String pizzaList) {
        this.q = q;
        this.pizzaList = pizzaList;
    }

    @Override
    public void run() {
        try {
            String[] p = pizzaList.split(",");
            for (int i = 0; i < p.length; i++) {
                q.getProducts().add(p[i]);
                System.out.println("New pizza is ready: " + p[i]);
                sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
