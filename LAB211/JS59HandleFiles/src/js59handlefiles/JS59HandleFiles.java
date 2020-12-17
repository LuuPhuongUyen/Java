/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js59handlefiles;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class JS59HandleFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextFile tf = new TextFile();
        while (true) {
            int choice = tf.menu();
            switch (choice) {
                case 1:
                    tf.findPersonInfo();
                    break;
                case 2:
                    tf.coppyNewFile();
                    break;
                case 3:
                    return;
            }
        }
    }
}
