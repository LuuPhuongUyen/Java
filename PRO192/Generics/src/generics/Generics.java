/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import GenericsClass.Customer;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList al = new ArrayList();
        al.add("Sachin");
        al.add("Rahul");
        String s1 = (String) al.get(0);
        String s2 = (String) al.get(1);
        System.out.println("" + s1);
        System.out.println("" + s2);

        ArrayList<String> als = new ArrayList<String>();
        als.add("Sachin");
        als.add("Rahul");
        String s3 = als.get(0);
        String s4 = als.get(1);
        System.out.println("" + s3);
        System.out.println("" + s4);
    }
}
