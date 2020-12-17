/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js68student;

import java.util.*;

/**
 *
 * @author LuuPhuongUyen SE1401
 */
public class JS68Student {

    String checkInputString() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String result = in.nextLine();
            if (result.length() == 0) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    boolean checkInputYN() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String result = in.nextLine();
            if (result.length() == 1 && result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.length() == 1 && result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Re-input.");
        }
    }

    float checkInputFloat() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                float result = Float.parseFloat(in.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    void addStudent(ArrayList<Student> lt) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = checkInputString();
        System.out.print("Classes: ");
        String classes = checkInputString();
        System.out.print("Mark: ");
        float mark = checkInputFloat();
        lt.add(new Student(name, mark, classes));
    }

    void print(ArrayList<Student> lt) {
        if (lt.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            System.out.println("--------Student " + (i + 1) + "--------");
            System.out.println("Name: " + lt.get(i).getName());
            System.out.println("Classes: " + lt.get(i).getClasses());
            System.out.println("Mark: " + lt.get(i).getMark());
        }
    }

    void display() {
        ArrayList<Student> lt = new ArrayList<>();
        addStudent(lt);
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (checkInputYN()) {
                addStudent(lt);
            } else {
                break;
            }
        }
        print(lt);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        JS68Student s = new JS68Student();
        s.display();
    }
}
