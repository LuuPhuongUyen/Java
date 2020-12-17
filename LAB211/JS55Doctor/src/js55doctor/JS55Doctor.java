/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js55doctor;

import java.util.ArrayList;

/**
 *
 * @author LuuPhuongUyen SE1401
 */
public class JS55Doctor {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Doctor> ld = new ArrayList<>();
        DoctorManagement m = new DoctorManagement();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    m.addDoctor(ld);
                    break;
                case 2:
                    m.updateDoctor(ld);
                    break;
                case 3:
                    m.deleteDoctor(ld);
                    break;
                case 4:
                    m.searchDoctor(ld);
                    break;
                case 5:
                    return;
            }
        }
    }
}
