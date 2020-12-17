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
public class MoleculesDemo {

    public static void main(String[] args) {
        System.out.print("Enter structure: ");
        String structure = Validation.checkInputString();
        System.out.print("Enter name : ");
        String name = Validation.checkInputString();
        System.out.print("Enter weight: ");
        float weight = (float) Validation.checkInputFloat();
        Molecules mole = new Molecules(structure, name, weight);
        System.out.println(mole);
    }
}
