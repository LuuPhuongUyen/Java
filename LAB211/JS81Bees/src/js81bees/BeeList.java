/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js81bees;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author HaiTr
 */
public class BeeList {

    ArrayList<Bee> beeList = new ArrayList<>();

    public void createBeeList() {
        beeList = new ArrayList<>();
        WorkerBee worker = new WorkerBee();
        QueenBee queen = new QueenBee();
        DroneBee drone = new DroneBee();
        beeList.add(worker);
        beeList.add(queen);
        beeList.add(drone);

        Random rand = new Random();
        for (int i = 0; i < 7; i++) {
            int beeType = rand.nextInt(3);
            switch (beeType) {
                case 0:
                    beeList.add(new WorkerBee());
                    break;
                case 1:
                    beeList.add(new QueenBee());
                    break;
                case 2:
                    beeList.add(new DroneBee());
                    break;
            }
        }
    }

    public void attackBees() {
        if (beeList.isEmpty()) {
            System.out.println("List is empty. Please create the bee list.");
            return;
        }

        for (Bee bee : beeList) {
            bee.damage();
        }
    }

    public void display() {
        for (Bee bee : beeList) {
            bee.display();
        }
    }
}
