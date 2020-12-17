/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

/**
 *
 * @author PC
 */
public class Course implements Comparable<Course> {

    private String courseId;
    private String courseName;
    private int credit;

    public Course() {
    }

    public Course(String courseId, String courseName, int credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public int compareTo(Course o) {
        return o.credit >= credit ? -1 : 0;
    }

    public void print() {
        System.out.printf("%-15s%-15s%-15d\n", courseId, courseName, credit);
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", credit=" + credit + '}';
    }
}
