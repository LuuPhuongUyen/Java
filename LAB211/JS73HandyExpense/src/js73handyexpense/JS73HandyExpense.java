/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js73handyexpense;

/**
 *
 * @author PC
 */
public class JS73HandyExpense {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Validation v = new Validation();
        ListExpenses le = new ListExpenses();
        int choice;
        while (true) {
            choice = v.menu();
            switch (choice) {
                case 1:
                    le.addExpense();
                    break;
                case 2:
                    le.print();
                    break;
                case 3:
                    le.deleteExpense();
                    break;
                case 4:
                    return;

            }
        }
    }
}
