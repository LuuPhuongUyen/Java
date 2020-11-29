/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDriver;

/**
 *
 * @author PC
 */
public abstract class Person {

    protected String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }

    public abstract void display();

    public abstract double getSalary();
}
