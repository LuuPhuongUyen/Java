/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlpatientmanagementsystem;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Manager {

    Validation v = new Validation();

    public int menu() {
        System.out.println("|--------------------------------------------------|");
        System.out.println("|             PATIENTS MANAGEMENT SYSTEM           |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("| 1. Add new patient.                              |");
        System.out.println("| 2. Minimum fee patient.                          |");
        System.out.println("| 3. List out-patient.                             |");
        System.out.println("| 4. Search patient.                               |");
        System.out.println("| 5. Remove the in-patients after specified date.  |");
        System.out.println("| 6. Load and save file.                           |");
        System.out.println("| 7. EXIT.                                         |");
        System.out.println("----------------------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = v.checkInputIntLimit(1, 7);
        return choice;
    }

    public static void Save(ArrayList<Patient> li) throws FileNotFoundException {
        File f = new File("Patient.dat");

        if (f.exists()) {
            f.delete();
        }
        try {
            System.out.println(f.getPath());
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Patient it : li) {
                oos.writeObject(it);
            }
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadObjectFile(String filename) throws FileNotFoundException, IOException, java.io.EOFException {
        Patient item = new Patient();
        ArrayList<Patient> li = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            item = (Patient) ois.readObject();
            li.add(item);
            while (item != null) {
                item = (Patient) ois.readObject();
                li.add(item);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("");
        } catch (IOException e) {
            System.out.println("");
        } catch (ClassNotFoundException e) {
            System.out.println("");
        }
        for (Patient selectedItem : li) {
            selectedItem.printData();
        }
    }
}
