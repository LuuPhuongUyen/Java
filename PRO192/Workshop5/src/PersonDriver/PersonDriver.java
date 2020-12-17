/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDriver;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class PersonDriver {

    public static void main(String[] args) {
        Worker[] wkArray = new Worker[3];
        Worker wktemp = new Worker();
        for (int i = 0; i < 3; i++) {
            wkArray[i] = wktemp.input();
        }
        for (int i = 0; i < 3; i++) {
            wkArray[i].display();
        }
    }
}
