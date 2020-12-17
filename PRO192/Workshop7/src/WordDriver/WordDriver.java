/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordDriver;

import java.util.HashMap;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class WordDriver {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.addNewWord(hm);
                    break;
                case 2:
                    Manager.deleteWord(hm);
                    break;
                case 3:
                    Manager.translate(hm);
                    break;
                case 4:
                    return;
            }
        }
    }
}
