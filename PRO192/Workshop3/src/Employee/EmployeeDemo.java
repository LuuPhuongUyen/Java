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
public class EmployeeDemo {
    public static void main(String[] args) {
        // TODO code application logic here
        Employee lec1 = new Employee(123, "An", "Nguyen", 800);
        lec1.raiseSalary(30);
        System.out.println(lec1);
        Employee lec2 = new Employee(124, "Khanh", "Tran", 750);
        System.out.println(lec2);
    }
}
