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
public class Staff extends Person {

    private String school;
    private double pay;

    public Staff() {
    }

    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" + "school=" + school + ", pay=" + pay + '}';
    }

}
