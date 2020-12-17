/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js58dictionary;

import java.util.HashMap;

/**
 *
 * @author PC
 */
public class JS58Dictionary {

    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> hm = new HashMap<>();
        WordManagement m = new WordManagement();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    m.addNewWord(hm);
                    break;
                case 2:
                    m.deleteWord(hm);
                    break;
                case 3:
                    m.translate(hm);
                    break;
                case 4:
                    return;
            }
        }
    }
}
