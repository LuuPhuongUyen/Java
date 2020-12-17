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
public class Country extends Countries implements Comparable<Country> {

    private String terrain;

    public Country() {
    }

    public Country(String countryCode, String countryName, float countryArea, String countryTerrain) {
        super(countryCode, countryName, countryArea);
        this.terrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%-10s%-25s%-20.0f%-25s\n", this.countryCode,
                this.countryName, this.countryArea, this.terrain);
    }

    public String getCountryTerrain() {
        return terrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.terrain = countryTerrain;
    }

    @Override
    public int compareTo(Country t) {
        return this.getCountryName().compareTo(t.getCountryName());
    }
}
