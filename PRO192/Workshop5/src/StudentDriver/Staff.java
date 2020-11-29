/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDriver;

/**
 *
 * @author PC
 */
public class Staff extends Person {

    protected String school;
    protected double pay;

    public Staff() {
    }

    public Staff(String school, double pay) {
        this.school = school;
        this.pay = pay;
    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{Person[name=" + name + ", address=" + address + "], school=" + school + ", pay=" + pay + '}';
    }

}
