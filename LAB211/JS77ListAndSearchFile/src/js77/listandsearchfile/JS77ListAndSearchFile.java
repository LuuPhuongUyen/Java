/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js77.listandsearchfile;

/**
 *
 * @author PC
 */
public class JS77ListAndSearchFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Validation v = new Validation();
        FileManager f = new FileManager();
        String path, word;
        while (true) {
            f.menu();
            int choice = v.checkInputIntLimit(1, 3);
            switch (choice) {
                case 1:
                    System.out.println("Enter Path : ");
                    path = v.checkInputString();
                    System.out.println("Enter Word : ");
                    word = v.checkInputString();
                    int count = f.countWordInFile(path, word);
                    System.out.println("Total : " + count);
                    break;
                case 2:
                    System.out.println("Enter Path : ");
                    path = v.checkInputString();
                    System.out.println("Enter Word : ");
                    word = v.checkInputString();
                    f.getFileNameContainsWordInDirectory(path, word);
                    break;
                case 3:
                    return;
            }
        }
    }

}
