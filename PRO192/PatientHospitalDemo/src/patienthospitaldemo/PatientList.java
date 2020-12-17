/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patienthospitaldemo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PC
 */
public class PatientList {

    private ArrayList<Patient> patientList = new ArrayList<>();

    public ArrayList<Patient> getPatients() {
        return patientList;
    }

    public void setPatients(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public PatientList() {
        outPatient outPa = new outPatient();
        Date d1 = new Date("2019/11/01");
        outPa = new outPatient(150000, 100000, "O001", "Conan Tran", d1, "Female", 310000);
        patientList.add(outPa);
        d1 = new Date("2019/10/18");
        outPa = new outPatient(120000, 80000, "O002", "Doreamon Ly", d1, "Male", 450000);
        patientList.add(outPa);
        d1 = new Date("2019/07/25");
        outPa = new outPatient(120000, 80000, "O003", "Xuka Nguyen", d1, "Male", 650000);
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

    public void createPatient() {
        while (true) {
            System.out.print("Please input out-patient's code: ");
            String code = Validation.checkInputCode();
            if (isExist(code) != -1) {
                System.err.println("This patient existed in the system");
                //System.out.println("Please input again : ");
                //code = Validation.checkInputCode().trim();
            } else {
                System.out.println("Input name : ");
                String fullname = Validation.checkInputString();
                System.out.println("Input hospitalized Date : ");
                Date HospitalizedDate = Validation.checkInputDate();
                System.out.println("Input gender : ");
                String gender = Validation.checkInputGender();
                System.out.println("Input medicine cost :");
                double medicinecost = Validation.checkInputDouble();
                System.out.println("Input examination fee :");
                double examinationFee = Validation.checkInputDouble();
                System.out.println("Input testing fee :");
                double testingFee = Validation.checkInputDouble();
                patientList.add(new outPatient(examinationFee, testingFee, code, fullname, HospitalizedDate, gender, medicinecost));
                System.err.println("Input out-patient successful");
                System.out.println("Continue? Y/N");
                if (!Validation.checkInputYN()) {
                    return;
                }

            }
        }
    }

    public void listOutPatient() {
        System.out.printf("%-4s %-18s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code", "Fullname",
                "HospitDate", "Gender", "MediCost", "ExamFee", "TestFee", "Hospital Fee");
        for (int i = 0; i < patientList.size(); i++) {
            patientList.get(i).printData();
        }
    }

    public void searchPatient() {
        ArrayList<Patient> pt = new ArrayList<>();
        System.out.print("Please enter patient's code to search: ");
        String code = Validation.checkInputCode();
        int check = isExist(code);
        if (check != -1) {
            System.out.printf("%-4s %-18s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code", "Fullname",
                    "HospitDate", "Gender", "MediCost", "ExamFee", "TestFee", "Hospital Fee");
            patientList.get(check).printData();

        } else {
            System.err.println("Not exist");
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

    public void removePatient() {
        System.out.print("Please input specified date: ");
        Date date = Validation.checkInputDate();
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getHospitalizedDate().getTime() > date.getTime()) {
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
