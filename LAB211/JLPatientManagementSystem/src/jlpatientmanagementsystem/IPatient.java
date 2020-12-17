/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlpatientmanagementsystem;

import java.util.Date;

/**
 *
 * @author PC
 */
public interface IPatient {

    public double getHospitalFee();

    public Patient inputData();

    public void printData();

    public String getDischargedDate();
}
