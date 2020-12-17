/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PC
 */
public class CourseList {

    private ArrayList<Course> ls = new ArrayList<Course>();

    public CourseList() {
        ls.add(new Course("MAD", "Math", 3));
        ls.add(new Course("PRO", "Java", 3));
    }

    public void report() {
        for (Course l : ls) {
            System.out.println(l);
        }
    }

    public void search() {
        if (ls.isEmpty()) {
            System.err.println("List empty");
            return;
        }
        ArrayList< Course> searchById = new ArrayList<>();
        System.out.println("Enter course id to search: ");
        String id = Validation.checkInputString();
        for (Course course : ls) {
            if (course.getCourseId().contains(id)) {
                searchById.add(course);
            }
        }
        if (searchById.isEmpty()) {
            System.err.println("Not exist");
        } else {
            Collections.sort(searchById);
            System.out.printf("%-15s%-15s%-15s\n", "CourseId", "Course Name", "Credit");
            for (Course course : searchById) {
                course.print();
            }
        }
    }

    public void add() {
        while (true) {
            System.out.println("Enter course id: ");
            String courseId = Validation.checkInputString();
            System.out.println("Enter course name: ");
            String courseName = Validation.checkInputString();
            if (Validation.checkIdExist(ls, courseId) != -1) {
                System.err.println("Id has exist course. Please re-input");
                if (!Validation.checkInputYN()) {
                    return;
                }
            }
            System.out.println("Enter credit: ");
            int credit = Validation.checkInputInteger();
            ls.add(new Course(courseId, courseName, credit));
            System.out.println("Add course success");
            System.out.println("Continue? Y/N");
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }

    public void update() {
        if (ls.isEmpty()) {
            System.err.println("List empty");
            return;
        }
        System.out.println("Enter course id to update: ");
        String courseId = Validation.checkInputString();
        int index = Validation.checkIdExist(ls, courseId);
        if (index == -1) {
            System.err.println("Not found course");
            return;
        } else {
            System.out.println("Enter course name: ");
            String courseName = Validation.checkInputString();
            System.out.println("Enter credit: ");
            int credit = Validation.checkInputInteger();
            ls.get(index).setCourseId(courseId);
            ls.get(index).setCourseName(courseName);
            ls.get(index).setCredit(credit);
            System.err.println("Update success.");
            return;
        }
    }

    public void sort() {
        Collections.sort(ls);
        for (Course l : ls) {
            System.out.println(l);
        }
    }

    public ArrayList<Course> getLs() {
        return ls;
    }

    public void setLs(ArrayList<Course> ls) {
        this.ls = ls;
    }
}
