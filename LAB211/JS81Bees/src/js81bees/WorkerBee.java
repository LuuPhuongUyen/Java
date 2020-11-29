/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js81bees;

import java.util.Random;

/**
 *
 * @author HaiTr
 */
public class WorkerBee implements Bee {

    private float health;
    private String status;

    public WorkerBee() {
        this.health = 100;
        this.status = "Alive";
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void damage() {
        Random rand = new Random();
        int damageTaken = rand.nextInt(101);
        if (status.equals("Alive")) {
            health *= (1 - (damageTaken / 100.00));
            if (health < 70) {
                status = "Dead";
            }
        }
    }

    @Override
    public void display() {
        System.out.printf("%-7s   |   %-7.2f   |   %-7s\n", "Worker", health, status);
    }
}
