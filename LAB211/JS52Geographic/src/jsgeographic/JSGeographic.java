/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsgeographic;

import java.util.ArrayList;

/**
 *
 * @author LuuPhuongUyen SE1401
 */
public class JSGeographic {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Country> lc = new ArrayList<>();
        Manager m = new Manager();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    m.inputCountry(lc);
                    break;
                case 2:
                    m.printCountry(lc);
                    break;
                case 3:
                    m.searchName(lc);
                    break;
                case 4:
                    m.printAscending(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}
