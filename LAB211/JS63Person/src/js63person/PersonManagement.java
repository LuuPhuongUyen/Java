/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js63person;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class PersonManagement {

    public String checkInputString() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public int checkInputInt() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Input must be digit.");
            }
        }
    }

    public double checkInputSalary() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                if (result < 0) {
                    System.err.println("Salary is greater than zero");
                } else {
                    return result;
                }
            } catch (NumberFormatException ex) {
                System.err.println("You must input digidt.");
                System.out.print("Please input salary: ");
            }
        }
    }

    public int checkInputNumberStudent() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number student: ");
        int n = checkInputInt();
        return n;
    }

    public Person inputPersonInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Information of Person");
        System.out.print("Please input name: ");
        String name = checkInputString();
        System.out.print("Please input address: ");
        String address = checkInputString();
        System.out.print("Please input salary: ");
        double salary = checkInputSalary();
        return new Person(name, address, salary);
    }

    public void swap(PersonArr person1, PersonArr person2) {
        Person temp = person1.p;
        person1.p = person2.p;
        person2.p = temp;
    }

    public void sortBySalary(Person[] persons, PersonArr[] listPerson) {
        int n = persons.length;
        for (int i = 0; i < persons.length; i++) {
            listPerson[i] = new PersonArr(persons[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (listPerson[i].p.salary > listPerson[j].p.salary) {
                    swap(listPerson[i], listPerson[j]);
                }
            }
        }
        return;
    }
}
