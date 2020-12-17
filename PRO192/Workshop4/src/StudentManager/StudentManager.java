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
public class StudentManager {

    public static Student[] studentArr = new Student[10];
    public static int count = 3;

    public static void main(String[] args) {
        studentArr[0] = new Student("1", "Quynh Tran Ly", "Spring", "java");
        studentArr[1] = new Student("2", "Do Quang Hai", "Summer", ".net");
        studentArr[2] = new Student("3", "Nguyen Xuan Lan", "Spring", "c/c++");
        while (true) {
            Manager.menu();
            System.out.printf("Enter your choice: ");
            int choice = Validation.checkInputIntLimit(1, 3);
            switch (choice) {
                case 1:
                    Manager.createStudent(studentArr);
                    break;
                case 2:
                    Manager.displayStudent(studentArr);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
