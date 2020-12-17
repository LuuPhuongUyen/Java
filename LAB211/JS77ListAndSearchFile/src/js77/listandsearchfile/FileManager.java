/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js77.listandsearchfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author PC
 */
public class FileManager {

    public void menu() {
        System.out.println("=========== Word Program =========== ");
        System.out.println("1. Count word in file");
        System.out.println("2. Find file by word");
        System.out.println("3. Exit");
        System.out.println("Choose one option : ");
    }

    public int countWordInFile(String source, String word) {
        FileReader fr = null;

        try {
            fr = new FileReader(source);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
                line = br.readLine();
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void getFileNameContainsWordInDirectory(String source, String word) {
        File folder = new File(source);
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                if (countWordInFile(file.getAbsolutePath(), word) != 0) {
                    System.out.println("File name : " + file.getName());
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }
}
