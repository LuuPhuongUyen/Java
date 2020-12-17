/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patienthospitaldemo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Patient implements iPatient, Serializable {

    private String code;
    private String fullname;
    private Date hospitalizedDate;
    private String gender;
    private double medicineCost;

    public Patient() {
    }

    public Patient(String code, String fullname, Date hospitalizedDate, String gender, double medicineCost) {
        this.code = code;
        this.fullname = fullname;
        this.hospitalizedDate = hospitalizedDate;
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

    public Date getHospitalizedDate() {
        return hospitalizedDate;
    }

    public void setHospitalizedDate(Date hospitalizedDate) {
        this.hospitalizedDate = hospitalizedDate;
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
        try {
            long diffDays = (getDischargedDate().getTime() - hospitalizedDate.getTime()) / (24 * 60 * 60 * 1000);
            return (double) (medicineCost * diffDays + medicineCost);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Patient inputData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printData() {
        //System.out.printf("%-4s %-20s %2td/%2tm/%4tY %-6s %-10.2f %-10.2f ", this.code, this.fullname, this.hospitalizedDate, this.hospitalizedDate, this.hospitalizedDate, this.getGender(), this.medicineCost, this.getHospitalFee());
        System.out.printf("%-4s %-18s %-10s %-6s %-10s %-10s %-10s %-10s\n", this.code, this.fullname, this.hospitalizedDate, this.getGender(), this.medicineCost, 0, this.medicineCost, this.getHospitalFee());
    }//code, fullname,
//                hospitalizedDate, hospitalizedDate, hospitalizedDate, gender, medicineCost);

    @Override
    public Date getDischargedDate() {
        Date d = new Date();
       // System.out.print("Please input discharged date: ");
        //Date d = Validation.checkInputDate();
        return d;
    }

    @Override
    public String toString() {
        return "Patient{" + "code=" + code + ", fullname=" + fullname + ", hospitalizedDate=" + hospitalizedDate + ", gender=" + gender + ", medicineCost=" + medicineCost + '}';
    }
}
