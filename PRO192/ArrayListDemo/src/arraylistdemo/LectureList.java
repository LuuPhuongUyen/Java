/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

/**
 *
 * @author PC
 */
public class LectureList {

    private int id;
    private String name;
    private String department;
    String currentClass;

    public LectureList() {
    }

    public LectureList(int id, String name, String department, String currentClass) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.currentClass = currentClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    @Override
    public String toString() {
        return "ArrayLecturer{" + "id=" + id + ", name=" + name
                + ", department=" + department + ", currentClass=" + currentClass + '}';
    }
}
