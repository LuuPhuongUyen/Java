/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondriver;

/**
 *
 * @author PC
 */
public class Person {
    private String name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void gotoWork(){
        System.out.println("Everyday, I go to work in the morning.");
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + '}';
    }
    
}
