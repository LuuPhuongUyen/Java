/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagedemo.letmecalculate;

/**
 *
 * @author PC
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(10, 20));
    }
}
