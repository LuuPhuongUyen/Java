/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDriver;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class CarDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Car> cl = new ArrayList<>();
        while (true) {
            int choice = Validation.checkInputIntLimit(1, 5);
            switch (choice) {
//                cl.Add(new Car.newcar());
//                    break;
//                case 2:
//                    cl.Display();
//                    break;
//                case 3:
//                    cl.add();
//                    break;
//                case 4:
//                    cl.sort();
//                    break;
//                case 5:
//                    cl.update();
//                    break;
            }
        }
    }
}
