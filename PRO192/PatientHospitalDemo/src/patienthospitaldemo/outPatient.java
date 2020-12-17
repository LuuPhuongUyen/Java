/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patienthospitaldemo;

import java.util.Date;

/**
 *
 * @author PC
 */
public class outPatient extends Patient {

    private double examinationFee;
    private double testingFee;

    public outPatient() {
    }

    public outPatient(double examinationFee, double testingFee, String code, String fullname,
            Date hospitalizedDate, String gender, double medicineCost) {
        super(code, fullname, hospitalizedDate, gender, medicineCost);
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
//        System.out.printf("%-4s %-20s %2td/%2tm/%4tY %-6s %-10.2f %-10.2f %-10.2f %10.2f\n",
//                super.getCode(), super.getFullname(), super.getHospitalizedDate(),
//                super.getHospitalizedDate(), super.getHospitalizedDate(), super.getGender(),
//                super.getMedicineCost(), getExaminationFee(), getTestingFee(), getHospitalFee());
        System.out.printf("%-4s %-20s %2td/%2tm/%4tY %-6s %-10s %-10s %-10s %-10s\n",
                 super.getCode(), super.getFullname(), super.getHospitalizedDate(), super.getHospitalizedDate(), super.getHospitalizedDate(), super.getGender(), super.getMedicineCost(), this.examinationFee, this.testingFee, this.getHospitalFee());

    }
}
