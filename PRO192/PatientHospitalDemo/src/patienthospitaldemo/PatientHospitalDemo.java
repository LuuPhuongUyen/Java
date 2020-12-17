/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patienthospitaldemo;

import java.io.*;

/**
 *
 * @author PC
 */
public class PatientHospitalDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        PatientList pl = new PatientList();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    pl.createPatient();
                    break;
                case 2:
                    pl.minimumFee();
                    break;
                case 3:
                    pl.listOutPatient();
                    break;
                case 4:
                    pl.searchPatient();
                    break;
                case 5:
                    pl.removePatient();
                    break;
                case 6:
                    try {
                        Manager.Save(pl.getPatients());
                        Manager.ReadObjectFile("Patient.dat");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    return;
            }
        }
    }
}
