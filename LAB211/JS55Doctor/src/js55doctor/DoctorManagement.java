/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js55doctor;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class DoctorManagement {

    Validation v = new Validation();

    public int menu() {
        System.out.println("==== DOCTOR ====");
        System.out.println("1. Add doctor");
        System.out.println("2. Update doctor");
        System.out.println("3. Delete doctor");
        System.out.println("4. Search doctor");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = v.checkInputIntLimit(1, 5);
        return choice;
    }

    public void addDoctor(ArrayList<Doctor> ld) {
        System.out.print("Enter code: ");
        String code = v.checkInputString();
        if (!v.checkCodeExist(ld, code)) {
            System.err.println("Code existed!");
            return;
        }
        System.out.print("Enter name: ");
        String name = v.checkInputString();
        System.out.print("Enter specialization: ");
        String specialization = v.checkInputString();
        System.out.print("Enter availability: ");
        int availability = v.checkInputInt();
        if (!v.checkDuplicate(ld, code, name, specialization, availability)) {
            System.err.println("Duplicate.");
            return;
        }
        ld.add(new Doctor(code, name, specialization, availability));
        System.err.println("Add successful.");
    }

    public void updateDoctor(ArrayList<Doctor> ld) {
        System.out.print("Enter code: ");
        String code = v.checkInputString();
        if (v.checkCodeExist(ld, code)) {
            System.err.println("Not found doctor");
            return;
        }
        System.out.print("Enter code: ");
        String codeUpdate = v.checkInputString();
        Doctor doctor = getDoctorByCode(ld, code);
        System.out.print("Enter name: ");
        String name = v.checkInputString();
        System.out.print("Enter specialization: ");
        String specialization = v.checkInputString();
        System.out.print("Enter availability: ");
        int availability = v.checkInputInt();
        doctor.setCode(codeUpdate);
        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setAvailability(availability);
        System.err.println("Update successful");
    }

    public void deleteDoctor(ArrayList<Doctor> ld) {
        System.out.print("Enter code: ");
        String code = v.checkInputString();
        Doctor doctor = getDoctorByCode(ld, code);
        if (doctor == null) {
            System.err.println("Not found doctor.");
            return;
        } else {
            ld.remove(doctor);
        }
        System.err.println("Delete successful.");
    }

    public void searchDoctor(ArrayList<Doctor> ld) {
        System.out.print("Enter name: ");
        String nameSearch = v.checkInputString();
        ArrayList<Doctor> listFoundByName = listFoundByName(ld, nameSearch);
        if (listFoundByName.isEmpty()) {
            System.err.println("List empty.");
        } else {
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            for (Doctor doctor : listFoundByName) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            }
        }
    }

    public Doctor getDoctorByCode(ArrayList<Doctor> ld, String code) {
        for (Doctor doctor : ld) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

    public ArrayList<Doctor> listFoundByName(ArrayList<Doctor> ld, String name) {
        ArrayList<Doctor> listFoundByName = new ArrayList<>();
        for (Doctor doctor : ld) {
            if (doctor.getName().contains(name)) {
                listFoundByName.add(doctor);
            }
        }
        return listFoundByName;
    }
}
