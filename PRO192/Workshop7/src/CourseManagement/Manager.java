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
public class Manager {

    public static void menu() {
        System.out.println("1. A list of all available courses in the system");
        System.out.println("2. Search and display information of a course by course id");
        System.out.println("3. Record/Add information of course");
        System.out.println("4. Sort all courses by number of credit as ascending ");
        System.out.println("5. Update information of a specific course (by course id) ");
        System.out.println("0. Exit ");
        System.out.print(" Enter your choice: ");
    }
}
