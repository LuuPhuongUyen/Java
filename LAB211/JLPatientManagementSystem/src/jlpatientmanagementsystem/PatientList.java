/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlpatientmanagementsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class PatientList {

    Validation v = new Validation();
    private ArrayList<Patient> patientList = new ArrayList<>();

    public ArrayList<Patient> getPatients() {
        return patientList;
    }

    public void setPatients(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public PatientList() {
        OutPatient outPa = new OutPatient();
        String d1 = v.checkInputDate();
        outPa = new OutPatient(150000, 100000, "O001", "aaaa", "20/3/2020", "0123456789", "Female", 230000);
        patientList.add(outPa);
        outPa = new OutPatient(120000, 80000, "O002", "bbbbb", "22/2/2020", "0532146798", "Male", 120000);
        patientList.add(outPa);
        outPa = new OutPatient(120000, 80000, "O003", "ccccc", "10/10/2020", "0156981379", "Male", 750000);
        patientList.add(outPa);
    }

    public int isExist(String code) {
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    public void createInPatient() {
        while (true) {
            System.out.print("Please input in-patient's code: ");
            String code = v.checkInputCode();
            if (isExist(code) != -1) {
                System.err.println("This patient existed in the system");
            } else {
                System.out.println("Input name : ");
                String fullname = v.checkInputString();
                System.out.println("Input hospitalized Date : ");
                String HospitalizedDate = v.checkInputDate();
                System.out.println("Input phone : ");
                String phone = v.checkInputPhone();
                System.out.println("Input gender : ");
                String gender = v.checkInputGender();
                System.out.println("Input medicine cost :");
                double medicinecost = v.checkInputDouble();
                patientList.add(new Patient(code, fullname, HospitalizedDate, phone, gender, medicinecost));
                System.err.println("Input out-patient successful");
                System.out.println("Continue? Y/N");
                if (!v.checkInputYN()) {
                    return;
                }
            }
        }
    }

    public void createOutPatient() {
        while (true) {
            System.out.print("Please input out-patient's code: ");
            String code = v.checkInputCode();
            if (isExist(code) != -1) {
                System.err.println("This patient existed in the system");
            } else {
                System.out.println("Input name : ");
                String fullname = v.checkInputString();
                System.out.println("Input hospitalized Date : ");
                String HospitalizedDate = v.checkInputDate();
                System.out.println("Input phone : ");
                String phone = v.checkInputPhone();
                System.out.println("Input gender : ");
                String gender = v.checkInputGender();
                System.out.println("Input medicine cost :");
                double medicinecost = v.checkInputDouble();
                System.out.println("Input examination fee :");
                double examinationFee = v.checkInputDouble();
                System.out.println("Input testing fee :");
                double testingFee = v.checkInputDouble();
                patientList.add(new OutPatient(examinationFee, testingFee, code, fullname, HospitalizedDate, phone, gender, medicinecost));
                System.err.println("Input out-patient successful");
                System.out.println("Continue? Y/N");
                if (!v.checkInputYN()) {
                    return;
                }
            }
        }
    }

    public void listOutPatient() {
        System.out.printf("%-4s %-18s %-10s %10s %-6s %-10s %-10s %-10s %-10s\n", "Code", "Fullname",
                "HospitDate", "Phone", "Gender", "MediCost", "ExamFee", "TestFee", "Hospital Fee");
        for (int i = 0; i < patientList.size(); i++) {
            patientList.get(i).printData();
        }
    }

    public void minimumFee() {
        double minimum = patientList.get(0).getHospitalFee();
        int index = 0;
        System.out.printf("%-4s %-18s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code",
                "Fullname", "HospitDate", "Gender", "MediCost", "ExamFee", "TestFee", "Hospital Fee");
        for (int i = 1; i < patientList.size(); i++) {
            if (patientList.get(i).getHospitalFee() < minimum) {
                minimum = patientList.get(i).getHospitalFee();
            }
        }
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getHospitalFee() == minimum) {
                index = i;
            }
        }
        patientList.get(index).printData();

    }

    public void removePatient() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Please input specified date: ");
        String date = v.checkInputDate();
        for (int i = 0; i < patientList.size(); i++) {
            if (formatter.parse(patientList.get(i).getHospitalizedDate()).getTime() > formatter.parse(date).getTime()) {
                patientList.remove(i);
            }
        }
        System.err.println("Remove success\n");
        System.out.println("List after removing: \n");
        System.out.printf("%-4s %-18s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code",
                "Fullname", "HospitDate", "Gender", "MediCost", "ExamFee", "TestFee", "Hospital Fee");
        for (int i = 0; i < patientList.size(); i++) {
            patientList.get(i).printData();
        }
    }
}
