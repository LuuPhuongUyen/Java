/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.*;
/**
 *
 * @author PC
 */
public class WriterReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person("John", 30, "Male");
        Person p2 = new Person("Rachel", 20, "Female");
        try {
            FileOutputStream f = new FileOutputStream(new File("Objects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(p1);
            o.writeObject(p2);
            o.close();
            f.close();
            FileInputStream fi = new FileInputStream(new File("Objects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            Person pr1 = (Person) oi.readObject();
            Person pr2 = (Person) oi.readObject();
            System.out.println(pr1.toString());
            System.out.println(pr2.toString());
            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
