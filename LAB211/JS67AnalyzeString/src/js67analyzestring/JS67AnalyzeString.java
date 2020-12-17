/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js67analyzestring;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class JS67AnalyzeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        String inputString = sc.nextLine();
        Display d = new Display();
        d.getNumber(inputString);
        d.getCharacter(inputString);
    }
}
