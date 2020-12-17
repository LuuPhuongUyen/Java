/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js54contact;

import java.util.ArrayList;

/**
 *
 * @author LuuPhuongUyen SE1401
 */
public class JS54Contact {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Contact> lc = new ArrayList<>();
        lc.add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        lc.add(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        lc.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        ContactManagement m = new ContactManagement();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    m.createContact(lc);
                    break;
                case 2:
                    m.printAllContact(lc);
                    break;
                case 3:
                    m.deleteContactd(lc);
                    break;
                case 4:
                    return;
            }
        }
    }
}
