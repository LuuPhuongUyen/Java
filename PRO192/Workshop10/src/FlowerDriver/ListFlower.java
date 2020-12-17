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
public class ListFlower<T> {

    private T obj;

    public ListFlower() {
    }
//
//    public ListFlower(T obj) {
//        this.obj = obj;
//    }
//
//    public T getObj() {
//        return obj;
//    }
//
//    public void setObj(T obj) {
//        this.obj = obj;
//    }

    public ArrayList<T> fl = new ArrayList<>();

    public void Add(T o) {
        System.out.println("Add: ");
        fl.add(o);
    }

    public void Display() {
        System.out.println("List: ");
        for (T o : fl) {
            System.out.println(o);
        }
    }
//
//    public void Sort() {
//
//    }
//
//    public boolean checkEmpty() {
//        return fl.isEmpty();
//    }
//
//    public void Delete(int i) {
//        fl.remove(i);
//        System.out.println("Removed");
//    }
}
