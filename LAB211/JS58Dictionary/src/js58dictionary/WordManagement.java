/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js58dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author PC
 */
public class WordManagement {

    Validation v = new Validation();

    public int menu() {
        System.out.println("1. Add new word.");
        System.out.println("2. Delete word.");
        System.out.println("3. Search word.");
        System.out.println("4. Exit.");
        System.out.print("Enter your choice: ");
        int choice = v.checkInputIntLimit(1, 4);
        return choice;
    }

    public void addNewWord(HashMap<String, String> hm) {
        System.out.print("Enter English: ");
        String english = v.checkInputString();
        if (!checkKeywordExist(hm, english)) {
            if (!v.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnam = v.checkInputString();
        hm.put(english, vietnam);
        System.err.println("Add successful.");
    }

    public void deleteWord(HashMap<String, String> hm) {
        System.out.print("Enter English: ");
        String english = v.checkInputString();
        hm.remove(english);
        System.err.println("Delete successful.");
    }

    public void translate(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = v.checkInputString();
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry entry : entries) {
            if (entry.getKey().equals(english)) {
                System.out.println("Vietnamese: " + entry.getValue());
                return;
            }
        }
        System.err.println("Not found in data");
    }

    public boolean checkKeywordExist(HashMap<String, String> hm, String english) {
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            if (english.equalsIgnoreCase(mentry.getKey().toString())) {
                return false;
            }
        }
        return true;
    }
}
