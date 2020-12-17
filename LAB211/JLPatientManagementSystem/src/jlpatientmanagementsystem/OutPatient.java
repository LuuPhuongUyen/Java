/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlpatientmanagementsystem;

/**
 *
 * @author PC
 */
public class OutPatient extends Patient {

    private double examinationFee;
    private double testingFee;

    public OutPatient() {
    }

    public OutPatient(double examinationFee, double testingFee, String code, String fullname,
            String hospitalizedDate, String phone, String gender, double medicineCost) {
        super(code, fullname, hospitalizedDate, phone, gender, medicineCost);
        this.examinationFee = examinationFee;
        this.testingFee = testingFee;
    }

    public double getExaminationFee() {
        return examinationFee;
    }

    public void setExaminationFee(double examinationFee) {
        this.examinationFee = examinationFee;
    }

    public double getTestingFee() {
        return testingFee;
    }

    public void setTestingFee(double testingFee) {
        this.testingFee = testingFee;
    }

    @Override
    public double getHospitalFee() {
        return super.getMedicineCost() + getExaminationFee() + getTestingFee();
    }

    @Override
    public void printData() {
        System.out.printf("%-4s %-20s %2td/%2tm/%4tY %10s %-6s %-10s %-10s %-10s %-10s\n",
                super.getCode(), super.getFullname(), super.getHospitalizedDate(), super.getHospitalizedDate(), super.getHospitalizedDate(), super.getPhone(), super.getGender(), super.getMedicineCost(), this.examinationFee, this.testingFee, this.getHospitalFee());

    }
}
