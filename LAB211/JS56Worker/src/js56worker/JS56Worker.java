/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js56worker;

import java.util.ArrayList;

/**
 *
 * @author LuuPhuongUyen SE1401
 */
public class JS56Worker {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<SalaryHistory> lh = new ArrayList<>();
        WorkerManagement m = new WorkerManagement();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    m.addWorker(lw);
                    break;
                case 2:
                    m.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    m.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    m.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}
