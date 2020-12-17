/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

/**
 *
 * @author PC
 */
public class StudentDriver {

    public static void main(String[] args) {
        StudentList sl = new StudentList();
        while (true) {
            Manager.menu();
            int choice = Validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    sl.createStudent();
                    break;
                case 2:
                    sl.findAndSort();
                    break;
                case 3:
                    sl.updateOrDelete();
                    break;
                case 4:
                    sl.report();
                    break;
                case 5:
                    return;
            }
        }
    }
}
