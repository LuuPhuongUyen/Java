/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PC
 */
public class Country {

    private String CountryID, CountryName;
    private int NumOfInfected, NumOfDead;

    public Country() {
    }

    public Country(String CountryID, String CountryName, int NumOfInfected, int NumOfDead) {
        this.CountryID = CountryID;
        this.CountryName = CountryName;
        this.NumOfInfected = NumOfInfected;
        this.NumOfDead = NumOfDead;
    }

    public String getCountryID() {
        return CountryID;
    }

    public String getCountryName() {
        return CountryName;
    }

    public int getNumOfInfected() {
        return NumOfInfected;
    }

    public int getNumOfDead() {
        return NumOfDead;
    }

    public void setCountryID(String CountryID) {
        this.CountryID = CountryID;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public void setNumOfInfected(int NumOfInfected) {
        this.NumOfInfected = NumOfInfected;
    }

    public void setNumOfDead(int NumOfDead) {
        this.NumOfDead = NumOfDead;
    }

    @Override
    public String toString() {
        return "Country{" + "CountryID=" + CountryID + ", CountryName=" + CountryName + ", NumberOfInfectedPatient=" + NumOfInfected + ", NumberOfDead=" + NumOfDead + '}';
    }

}
