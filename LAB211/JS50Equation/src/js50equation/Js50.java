/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js50equation;

/**
 *
 * @author PC
 */
public class Js50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equation e = new Equation();
        while (true) {
            int choice = Validation.menu();
            switch (choice) {
                case 1:
                    e.superlativeEquation();
                    break;
                case 2:
                    e.quadraticEquation();
                    break;
                case 3:
                    return;
            }
        }
    }
}
