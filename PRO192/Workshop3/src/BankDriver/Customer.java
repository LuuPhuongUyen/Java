/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankDriver;

/**
 *
 * @author PC
 */
public class Customer {
    private int id;
    private String name;
    private char gender;
    public Customer(){
    }

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", gender=" + gender + '}';
    }
    
    
}
