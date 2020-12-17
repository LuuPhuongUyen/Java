/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js75.handlefileprogram;

import java.io.IOException;

/**
 *
 * @author PC
 */
public class JS75HandleFileProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here  
        Validation v = new Validation();
        HandleFile f = new HandleFile();
        while (true) {
            f.menu();
            System.out.println("Please choose one option ");
            int opt = v.checkInputIntLimit(1, 6);
            switch (opt) {
                case 1:
                    f.checkPath();
                    break;
                case 2:
                    f.getAllFileNameJavaInDirectory();
                    break;
                case 3:
                    f.getFileWithSizeGreaterThanInput();
                    break;
                case 4:
                    f.appendContentToFile();
                    break;
                case 5:
                    f.countCharacter();
                    break;
                case 6:
                    return;
            }
        }
    }

}
