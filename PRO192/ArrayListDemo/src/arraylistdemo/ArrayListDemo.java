/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(9);
        arr.add(10);
        arr.add(56);
        arr.add(19);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
    }

}
