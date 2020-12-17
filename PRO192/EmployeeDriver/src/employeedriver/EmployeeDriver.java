/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedriver;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
//        Employee emp1 = new Employee(110, "Nhan", "Nguyen", 800, "FPT");
//        Employee emp2 = new Employee(112, "Hoang", "Tran", 1000, "FPT");
//        System.out.println(emp1);
//        System.out.println(emp2);
//        System.out.println("Hoang annual salary: " + emp2.getAnnualSalary());
//        System.out.println("New salary of Mr Hoang: " + emp2.raiseSalary(300));
//        System.out.println(emp2);
//        Employee.setCompany("FPT Hoa Hai");
//        System.out.println(emp1);
//        System.out.println(emp2);
//
//        Employee[] arrEmp = new Employee[3];
//        arrEmp[0] = emp1;
//        arrEmp[1] = emp2;
//        arrEmp[2] = new Employee(113, "Tran", "Ly", 2000, "FPT Hoa Lac");
//        arrEmp[3] = new Employee(114, "Anh", "Tran", 2000, "FPT Hoa Lac");
//        for (int i = 0; i < arrEmp.length; i++) {
//            System.out.println(arrEmp[i]);
//               }
        //        for (int i = 2; i < 3; i++) {
//            arrEmp[i] = emp.inputData();
//            emp.Display();
        //}
        Employee empTemp = new Employee();

        while (true) {
            Manager.menu();
            int choice = (int) Validation.checkInputInt();
            switch (choice) {
                case 1:
                    empTemp.inputData();
                    break;
                case 2:
                    empTemp.Display();
                    break;
                case 3:
                    return;
            }
        }
    }
}
