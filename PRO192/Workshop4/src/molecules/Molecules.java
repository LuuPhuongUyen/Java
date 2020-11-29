/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molecules;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class Molecules {

    private String structure;
    private String name;
    private float weight;

    public Molecules() {
    }

    public Molecules(String structure, String name, float weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void Display() {
        System.out.printf("Structure: " + structure + " name: " + name + " weight: %.5f ", weight);
    }
    @Override
    public String toString() {
        return "Structure: " + structure + ", name: " + name + ", weight: "+ weight;
    }
}
