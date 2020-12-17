/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printtabledemo;

/**
 *
 * @author PC
 */
public class PrintTableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "John";
        float f = 92.385f;
        String str2 = "Single";
        System.out.println("---------------------");
        System.out.printf("%-10s%2s%10s\n", "NAME", "SALARY", "STATUS");
        System.out.println();
        System.out.printf("%-10s%.2f%10s\n", str, f, str2);
    }

}
