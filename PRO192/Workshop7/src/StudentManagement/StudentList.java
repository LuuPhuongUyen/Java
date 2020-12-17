/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PC
 */
public class StudentList {

    private ArrayList<Student> ls = new ArrayList<Student>();

    public StudentList() {
        ls.add(new Student("1", "An", "3", "Java"));
        ls.add(new Student("2", "Binh", "1", "C/C++"));
    }

    public void createStudent() {
        while (true) {
            System.out.println("Enter id: ");
            String id = Validation.checkInputString();
            System.out.println("Enter name: ");
            String name = Validation.checkInputString();
            if (Validation.checkIdExist(ls, id) != -1) {
                System.err.println("Id has exist student. Please re-input");
                if (!Validation.checkInputYN()) {
                    return;
                }
            }
            System.out.println("Enter semester: ");
            String semester = Validation.checkInputString();
            System.out.println("Enter course: ");
            String course = Validation.checkInputCourse();
            ls.add(new Student(id, name, semester, course));
            System.out.println("Add student success");
            System.out.println("Continue? Y/N");
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }

    public void findAndSort() {
        if (ls.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        ArrayList<Student> listStudentFindByName = new ArrayList<>();
        System.out.println("Enter name to search: ");
        String name = Validation.checkInputString();
        for (Student student : ls) {
            if (student.getStudentName().contains(name)) {
                listStudentFindByName.add(student);
            }
        }
        if (listStudentFindByName.isEmpty()) {
            System.err.println("Not exist");
        } else {
            Collections.sort(listStudentFindByName);
            System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name");
            for (Student student : listStudentFindByName) {
                student.print();
            }
        }
    }

    public void updateOrDelete() {
        if (ls.isEmpty()) {
            System.err.println("List empty");
            return;
        }
        System.out.println("Enter id to update/delete: ");
        String id = Validation.checkInputString();
        int index = Validation.checkIdExist(ls, id);
        if (index == -1) {
            System.err.println("Not found student");
            return;
        } else {
            System.out.print("Do you want to update (U) or delete (D) student: ");
            if (Validation.checkInputUD() == 'U') {
                System.out.println("Enter name: ");
                String name = Validation.checkInputString();
                System.out.println("Enter semester: ");
                String semester = Validation.checkInputString();
                System.out.println("Enter course: ");
                String course = Validation.checkInputCourse();
                ls.get(index).setStudentName(name);
                ls.get(index).setSemester(semester);
                ls.get(index).setCourseName(course);
                System.err.println("Update success.");
                return;

            } else {
                ls.remove(index);
                System.err.println("Delete success");
                return;
            }
        }
    }

    public void report() {
        Collections.sort(ls);
        for (Student l : ls) {
            System.out.println(l);
        }
    }

    public ArrayList<Student> getLs() {
        return ls;
    }

    public void setLs(ArrayList<Student> ls) {
        this.ls = ls;
    }

}
