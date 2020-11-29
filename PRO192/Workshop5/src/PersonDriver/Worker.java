/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDriver;

import java.text.DecimalFormat;

/**
 *
 * @author PC
 */
public class Worker extends Person {

    double bSalary;
    double rate;

    public Worker() {
    }

    public Worker(String name) {
        super(name);
    }

    public Worker(String name, double bSalary, double rate) {
        super(name);
        this.bSalary = bSalary;
        this.rate = rate;
    }

    public Worker(double bSalary, double rate) {
        this.bSalary = bSalary;
        this.rate = rate;
    }

    @Override
    public void display() {
        System.out.println("-------------------------------------");
        System.out.println("Name = " + name);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Salary = " + df.format(getSalary()));
    }

    @Override
    public double getSalary() {
        return (double) bSalary * rate;
    }

    public Worker input() {
        String name;
        double salaryBasic, rate;
        Worker wk = new Worker();
        System.out.print("Enter name: ");
        name = Validation.checkInputString();     
        System.out.print("Enter salary basic: ");
        salaryBasic = Validation.checkInputDouble();
        Validation.in.nextLine();
        System.out.print("Enter rate: ");
        rate = Validation.checkInputDouble();
        Validation.in.nextLine();
        wk = new Worker(name, salaryBasic, rate);
        return wk;
    }
}
