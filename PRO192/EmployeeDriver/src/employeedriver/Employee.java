/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedriver;

import static employeedriver.EmployeeDriver.input;

/**
 *
 * @author PC
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private static String company;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, double salary, String company) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.company = company;
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

    public double getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        double rs;
        rs = salary * 12;
        return rs;
    }

    public double raiseSalary(int percentage) {
        salary = salary + salary * percentage / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id: " + id + " name: " + firstName + " " + lastName + " " + "salary: " + salary + " company: " + company + "]";
    }

    public Employee inputData() {
        System.out.println("Enter ID: ");
        //int id = input.nextInt();
        int id = (int) Validation.checkInputInt();
        input.nextLine();
        System.out.println("Enter first name: ");
        //String firstName = input.nextLine();
        String firstName = Validation.checkInputString();
        System.out.println("Enter last name: ");
        //String lastName = input.nextLine();
        String lastName = Validation.checkInputString();
        System.out.println("Enter salary: ");
        //double sl = input.nextDouble();
        double salary = Validation.checkInputDouble();
        //input.nextLine();
        System.out.println("Enter company: ");
        //String com = input.nextLine();
        String company= Validation.checkInputString();
        Employee emp = new Employee(id, firstName, lastName, salary, company);
        System.out.println(emp);
        return emp;
    }

    public void Display() {
        System.out.println("ID: " + id);
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("salary: " + salary);
        System.out.println("company: " + company);
    }
}
