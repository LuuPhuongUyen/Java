/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js51bmi;

/**
 *
 * @author PC
 */
public class JS51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            int choice = Calculator.menu();
            switch (choice) {
                case 1:
                    Calculator.normalCalculator();
                    break;
                case 2:
                    Calculator.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }
}
