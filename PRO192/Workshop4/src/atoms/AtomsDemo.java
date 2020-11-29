/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atoms;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class AtomsDemo {

    /**
     * @param args the command line arguments
     */
    static Atoms[] atomArray = new Atoms[2];

    public static void main(String[] args) {

        while (true) {
            Manager.menu();
            System.out.printf("Enter your choice: ");
            int choice = (int) Validation.checkInputInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < atomArray.length; i++) {
                        Atoms atom = new Atoms();
                        atomArray[i] = atom.enterData();
                    }
                    break;
                case 2:
                    for (int i = 0; i < atomArray.length; i++) {
                        atomArray[i].Display();
                    }
                    System.out.println("");
                    break;
                case 3:
                    return;
            }
        }
    }
}
