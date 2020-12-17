/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlpatientmanagementsystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class JLPatientManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here     
        Manager m = new Manager();
        PatientList pl = new PatientList();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    pl.createInPatient();
                    break;
                case 2:
                    pl.createOutPatient();
                    break;
                case 3:
                    pl.listOutPatient();
                    break;
                case 4:
                    pl.minimumFee();
                    break;
                case 5: {
                    try {
                        pl.removePatient();
                    } catch (ParseException ex) {
                        Logger.getLogger(JLPatientManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
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
