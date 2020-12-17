/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomaccessfiledemo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class RandomAccessFileDemo {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<Product> lp = new ArrayList<>();
        ArrayList<Order> lo = new ArrayList<>();
        lp.add(new Product(1, "Apple", 10));
        lp.add(new Product(2, "Banana", 5));
        lp.add(new Product(3, "Watermelon", 9));
        lp.add(new Product(4, "Peach", 7));
        lp.add(new Product(5, "Grapes", 8));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate now = LocalDate.now();
        lo.add(new Order(111, now, "An", "123 NT", 9, lp));
        lo.add(new Order(222, now, "Binh", "12 DBP", 12, lp));
        try {
            Manager.WriteObjectFile(lo);
            Manager.readObjectFile("FruitOder.dat");
        } catch (Exception e) {
            System.out.println(" " + e);
        }
    }
}
