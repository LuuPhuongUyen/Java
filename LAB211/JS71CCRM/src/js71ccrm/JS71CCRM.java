/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js71ccrm;

/**
 *
 * @author PC
 */
public class JS71CCRM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Validation v = new Validation();
        TaskList lt = new TaskList();
        int choice;
        while (true) {
            choice = v.menu();
            switch (choice) {
                case 1:
                    lt.addTask();
                    break;
                case 2:
                    lt.deleteTask();
                    break;
                case 3:
                    lt.print();
                    break;
                case 4:
                    return;

            }
        }
    }
}
