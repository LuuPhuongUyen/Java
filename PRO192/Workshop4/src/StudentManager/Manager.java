/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManager;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class Manager {

    public static void menu() {
        System.out.println("|-----------------------------|");
        System.out.println("|      STUDENT MANAGEMENT     |");
        System.out.println("|-----------------------------|");
        System.out.println("| 1. Create.                  |");
        System.out.println("| 2. Display.                 |");
        System.out.println("| 3. EXIT.                    |");
        System.out.println("-------------------------------");
    }

    public static void createStudent(Student[] ls) {
        if (StudentManager.count > 10) {
            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.accept()) {
                return;
            }
        }
        while (true) {
            System.out.print("Enter id: ");
            String id = Validation.checkInputString();
            System.out.print("Enter name student: ");
            String name = Validation.checkInputString();
            System.out.print("Enter semester: ");
            String semester = Validation.checkInputString();
            System.out.print("Enter name course: ");
            String course = Validation.checkInputCourse();
            ls[StudentManager.count] = new Student(id, name, semester, course);
            StudentManager.count++;
            System.out.println("Add student success.");
            return;
        }
    }

    public static void displayStudent(Student[] ls) {
        for (int i = 0; i < StudentManager.count; i++) {
            System.out.printf("%-15s|%-10s|%-5s\n", ls[i].getStudentName(), ls[i].getCourseName(), ls[i].getSemester());
        }
    }
}
