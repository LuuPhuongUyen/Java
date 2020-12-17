/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlpatientmanagementsystem;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 *
 * @author PC
 */
public class Patient implements IPatient, Serializable {

    private String code;
    private String fullname;
    private String hospitalizedDate;
    private String phone;
    private String gender;
    private double medicineCost;

    public Patient() {
    }

    public Patient(String code, String fullname, String hospitalizedDate, String phone, String gender, double medicineCost) {
        this.code = code;
        this.fullname = fullname;
        this.hospitalizedDate = hospitalizedDate;
        this.phone = phone;
        this.gender = gender;
        this.medicineCost = medicineCost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getHospitalizedDate() {
        return hospitalizedDate;
    }

    public void setHospitalizedDate(String hospitalizedDate) {
        this.hospitalizedDate = hospitalizedDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(double medicineCost) {
        this.medicineCost = medicineCost;
    }

    @Override
    public double getHospitalFee() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            long diffDays = (formatter.parse(getDischargedDate()).getTime() - formatter.parse(hospitalizedDate).getTime()) / (24 * 60 * 60 * 1000);
            return (double) (medicineCost * diffDays + medicineCost);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void printData() {
        System.out.printf("%-4s %-18s %-10s %-6s %-10s %-10s %-10s %-10s\n", this.code, this.fullname, this.hospitalizedDate, this.getGender(), this.medicineCost, 0, this.medicineCost, this.getHospitalFee());
    }

    @Override
    public String getDischargedDate() {
        Validation v = new Validation();
        String d = v.checkInputDate();
        return d;
    }

    @Override
    public String toString() {
        return "Patient{" + "code=" + code + ", fullname=" + fullname + ", hospitalizedDate=" + hospitalizedDate + ", gender=" + gender + ", medicineCost=" + medicineCost + '}';
    }

    @Override
    public Patient inputData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
