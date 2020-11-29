/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author PC
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary(int percentage) {
        salary = salary + salary * percentage / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee" + "[" + id + " " + firstName + " " + lastName + ", Salary = " + salary + ", Annual salary = " + getAnnualSalary() + "]";
    }
}
