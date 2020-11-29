package student;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC ws3
 */
public class Student {

    private static Scanner sc = new Scanner(System.in);
    private String name;
    private String studentID;
    private Date birthDate;
    private String address;
    private String major;
    private double gpa;

    public Student() {
    }

    public Student(String n, String id, Date dob, String addr, String m) {
        name = n;
        studentID = id;
        birthDate = dob;
        major = m;
    }

    public Student(String name, String studentID, Date birthDate, String address, String major, double GPA) {
        this.name = name;
        this.studentID = studentID;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.gpa = GPA;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setBirthDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        this.birthDate = cal.getTime();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printAllAttributes() {
        System.out.println("Student name: " + name);
        System.out.println("studentID: " + studentID);
        System.out.println("Birthdate: " + birthDate);
        System.out.println("Address: " + address);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }

    @Override
    public String toString() {
        return name + " " + studentID + " " + birthDate + " " + address + " " + major + " " + gpa;
    }
}
