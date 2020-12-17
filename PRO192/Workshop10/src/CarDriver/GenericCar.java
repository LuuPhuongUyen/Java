/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDriver;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class GenericCar<T> extends Car {

    public ArrayList<T> cl = new ArrayList<>();

    public void Add(T o) {
        System.out.println("Add: ");
        cl.add(o);
    }

    public void Display() {
        System.out.println("List: ");
        for (T o : cl) {
            System.out.println(cl);
        }
    }

    public int getSize() {
        return cl.size();
    }

    public boolean checkEmpty() {
        return cl.isEmpty();
    }

    public void Delete(int i) {
        cl.remove(i);
        System.out.println("Removed");
    }
}
