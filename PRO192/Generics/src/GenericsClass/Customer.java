/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsClass;

/**
 *
 * @author PC
 */
public class Customer<T> {
    private T name;
    private T address;

    public Customer() {
    }

    public Customer(T name, T address) {
        this.name = name;
        this.address = address;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getAddress() {
        return address;
    }

    public void setAddress(T address) {
        this.address = address;
    }
    
}
