/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;

/**
 *
 * @author PC
 */
public class Student {
    //Atributed
    String name;
    String ID;
    int year;
    double marks;
    //behavious
    
    //Constructor
    public Student() {
    }

    public Student(String n, String id, int y, double m) {
        name = n;
        ID = id;
        year = y;
        marks = m;
    }
      
    
    void goToUni()
    {
        System.out.println("Every morning, go to FPT");
    }
    
    double takeTest()
    {
        double result=9;
        System.out.println("Final and mid-Term test");
        return result;
    }
    
    void sport()
    {
        System.out.println("Nhau");
    }
    
    void shopping()
    {
        System.out.println("Shopping");     
    }
    
    void print()
    {
        System.out.println(name);
        System.out.println(ID);
        System.out.println(year);
        System.out.println(marks);
    }

    @Override
    public String toString() {
        return name + " "+ ID + " "+year +" "+marks;
    }
}
