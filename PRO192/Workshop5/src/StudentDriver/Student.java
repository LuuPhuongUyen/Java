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
public class Student extends Person {

    protected String program;
    protected int year;
    protected double fee;

    public Student() {
    }

    public Student(String program, int year, double fee) {
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{Person[name=" + name + ", address=" + address + "], program=" + program + ", year=" + year + ", fee=" + fee + '}';
    }
}
