/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diningphilosophers;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class DiningPhilosophers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Philosopher philosophers[] = new Philosopher[5];
        Object[] forks = new Object[5];
        for (int i = 0; i < 5; i++) {
            forks[i] = new Object();
        }
        for (int i = 0; i < 5; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % 5];
            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(leftFork, rightFork);
            } else {
                philosophers[i] = new Philosopher(rightFork, leftFork);
            }
            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}
