/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondriver;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Student extends Person {

    private String program;
    private int year;
    private double fee;
  
    public Student() {
    }

    public Student(String program, int year, double fee, String name, String address) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public void gotoWork() {
        System.out.println("Everyday, I go to FPT");
    }

    public void showGrade() {
        char grade;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter mark: ");
        int mark = in.nextInt();
        if (mark >= 90) {
            grade = 'A';
        } else if (mark >= 75) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Grade: " + grade);
    }

    @Override
    public String toString() {
        return "Student{" + "program=" + program + ", year=" + year + ", fee=" + fee + '}';
    }

}
