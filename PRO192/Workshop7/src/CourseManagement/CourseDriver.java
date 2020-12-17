/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class CourseDriver {

    public static void main(String[] args) {
        CourseList cl = new CourseList();
        while (true) {
            Manager.menu();
            int choice = Validation.checkInputIntLimit(0, 5);
            switch (choice) {
                case 0:
                    return;
                case 1:
                    cl.report();
                    break;
                case 2:
                    cl.search();
                    break;
                case 3:
                    cl.add();
                    break;
                case 4:
                    cl.sort();
                    break;
                case 5:
                    cl.update();
                    break;
            }
        }
    }
}

