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
public class Convert {

    public final char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    Validation v = new Validation();

    public int menu() {
        System.out.println("======== CONVERT ========");
        System.out.println("1. Convert decimal.");
        System.out.println("2. Convert binary.");
        System.out.println("3. Convert hexa.");
        System.out.println("4. EXIT.");
        System.out.print("Enter your choice: ");
        int choice = v.checkInputIntLimit(1, 4);
        return choice;
    }

    public int displayConvert(String from, String toCase1, String toCase2) {
        System.out.println("1. Convert " + from + " to " + toCase1);
        System.out.println("2. Convert " + from + " to " + toCase2);
        System.out.print("Enter your choice: ");
        int result = v.checkInputIntLimit(1, 2);
        return result;
    }

    public void convertDecimal(String decimal) {
        int choice = displayConvert("decimal", "binary", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println(decimal + "(10) = " + convertDecToBin(decimal) + "(2)");
                break;
            case 2:
                System.out.println(decimal + "(10) = " + convertDecToHex(decimal) + "(10)");
                break;
        }
    }

    public void convertBinary(String binary) {
        int choice = displayConvert("binary", "decimal", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println(binary + "(2) = " + convertBinToDec(binary) + "(10)");
                break;
            case 2:
                System.out.println(binary + "(2) = " + convertBinToHex(binary) + "(16)");
                break;
        }
    }

    public void convertHexa(String hex) {
        int choice = displayConvert("hexa", "binary", "decimal");
        switch (choice) {
            case 1:
                System.out.println(hex + "(16) = " + convertHexToBin(hex) + "(2)");
                break;
            case 2:
                System.out.println(hex + "(16) = " + convertHexToDec(hex) + "(10)");
                break;
        }
    }

    public String convertBinToDec(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    public String convertBinToHex(String binary) {
        String decimal = convertBinToDec(binary);
        String hexa = convertDecToHex(decimal);
        return hexa;
    }

    public int convertHexToDec(String hexadecimal) {
        int decimal = Integer.parseInt(hexadecimal, 16);
        return decimal;
    }

    public String convertHexToBin(String hexadecimal) {
        String binary = Integer.toBinaryString(convertHexToDec(hexadecimal));
        return binary;
    }

    public String convertDecToBin(String decimal) {
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }

    public String convertDecToHex(String decimal) {
        String hex = "";
        int deci = Integer.parseInt(decimal);
        while (deci != 0) {
            hex = hexDigits[deci % 16] + hex;
            deci /= 16;
        }
        return hex;
    }
}
