/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagedemo;

import packagedemo.letmecalculate.Calculator;

/**
 *
 * @author PC
 */
public class PackageDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator obj = new Calculator();
        int sum = obj.add(100, 200);
        System.out.println("Sum = " + sum);
    }

}
