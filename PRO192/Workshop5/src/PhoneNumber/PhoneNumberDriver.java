/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneNumber;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class PhoneNumberDriver {

    public static PhoneNumber[] phonelist = new PhoneNumber[10];
    public static int count = 3;

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.print("Type of phone number: 1. Local phone;" + " 2. Inter phone; 0. Exit: ");
            int typeOfPhone = Validation.in.nextInt();
            if (typeOfPhone == 1) {
                PhoneNumber phone = new PhoneNumber();
                phonelist[i] = phone.inputData();
                i++;
            } else if (typeOfPhone == 2) {
                IntPhoneNumber phone = new IntPhoneNumber();
                phonelist[i] = phone.inputData();
                i++;
            } else if (typeOfPhone == 0) {
                break;
            }
        }
        System.out.println("List of phone number:");
        for (int j = 0; j < i; j++) {
            phonelist[j].display();
        }
    }
}
