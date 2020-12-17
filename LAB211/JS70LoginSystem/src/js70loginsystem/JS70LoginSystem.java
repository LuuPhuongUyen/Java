/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js70loginsystem;

import java.util.Locale;

/**
 *
 * @author PC
 */
public class JS70LoginSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login lg = new Login();
        Locale vietnamese = new Locale("vi");
        Locale english = Locale.ENGLISH;
        System.out.println("------- Login Program -------");
        System.out.println("1. Vietnamese.");
        System.out.println("2. English.");
        System.out.println("3. EXIT.");
        System.out.print("Enter your choice: ");
        int choice = lg.checkInputIntLimit(1, 3, english);
        switch (choice) {
            case 1:
                lg.login(vietnamese);
                break;
            case 2:
                lg.login(english);
                break;
            case 3:
                return;
        }
    }
}
