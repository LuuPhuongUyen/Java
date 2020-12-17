/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsgeographic;

/**
 *
 * @author PC
 */
public class Countries {

    protected String countryCode;
    protected String countryName;
    protected float countryArea;

    public Countries() {
    }

    public Countries(String countryCode, String countryName, float countryArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryArea = countryArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(float countryArea) {
        this.countryArea = countryArea;
    }

    public void display() {
    }
}
