/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s004pizza;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ProducerConsumerQueue q = new ProducerConsumerQueue();
        String pizzaList = "Deluxe Pizza,Single Pizza,American Pizza,Double Pizza";
        System.out.println(pizzaList);
        Producer producer = new Producer(q, pizzaList);
        Consumer consumer = new Consumer(q);
        producer.start();
        consumer.start();
    }
}
