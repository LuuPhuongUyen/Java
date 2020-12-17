/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js11basenumber;

/**
 *
 * @author PC
 */
public class JS11BaseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convert c = new Convert();
        Validation v = new Validation();
        while (true) {
            int choice = c.menu();
            switch (choice) {
                case 1:
                    String decimal = v.checkInputDecimal();
                    c.convertDecimal(decimal);
                    break;
                case 2:
                    String binary = v.checkInputBinary();
                    c.convertBinary(binary);
                    break;
                case 3:
                    String hexa = v.checkInputHexaDecimal();
                    c.convertHexa(hexa);
                    break;
                case 4:
                    return;
            }
        }
    }
}
