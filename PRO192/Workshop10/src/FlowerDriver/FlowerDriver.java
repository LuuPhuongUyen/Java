/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlowerDriver;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class FlowerDriver {
    
    public static void main(String[] args) {
        ListFlower<Flower> fl = new ListFlower<>();
        System.out.println("Enter name: ");
        String name = Validation.checkInputString();
        System.out.println("Enter price: ");
        double price = Validation.checkInputDouble();
        System.out.println("Enter color: ");
        String color = Validation.checkInputString();
        Flower f =new Flower(name, price, color);
        fl.Add(f);
        //System.out.println(f);
        fl.Display();
    }
}
