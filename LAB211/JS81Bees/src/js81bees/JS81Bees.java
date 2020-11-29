/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js81bees;

/**
 *
 * @author PC
 */
public class JS81Bees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BeeList beeList = new BeeList();
        while (true) {
            Management.menu();
            System.out.print("Your option: ");
            int option = Validation.checkInputIntLimit(1, 3);

            switch (option) {
                case 1:
                    beeList.createBeeList();
                    beeList.display();
                    break;
                case 2:
                    beeList.attackBees();
                    beeList.display();
                    break;
                case 3:
                    return;
            }
        }
    }

}
