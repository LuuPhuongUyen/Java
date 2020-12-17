/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js12memorycache;

/**
 *
 * @author PC
 */
public class Student {

    private String name;
    private String classs;

    public Student() {
    }

    public Student(String name, String classs) {
        this.name = name;
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "Student{" + "name = " + name + ", class = " + classs + '}';
    }
}
