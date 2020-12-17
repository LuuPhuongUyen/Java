/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js59handlefiles;

/**
 *
 * @author PC
 */
public class Person implements Comparable<Person> {

    private String name;
    private String address;
    private double money;

    public Person() {
    }

    public Person(String name, String address, double money) {
        this.name = name;
        this.address = address;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public int compareTo(Person p) {
        return (int) (p.getMoney() - this.getMoney());
    }
}
