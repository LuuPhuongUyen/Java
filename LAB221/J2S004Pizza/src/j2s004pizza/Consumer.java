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
public class Consumer extends Thread {

    private ProducerConsumerQueue q;

    public Consumer() {
    }

    public Consumer(ProducerConsumerQueue q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (!q.getProducts().isEmpty()) {
                    System.out.println("Pizza delivered: " + (String) q.getProducts().remove());
                    System.out.println("Waiting for new Pizza!");
                } else {
                    sleep(1000);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

}
