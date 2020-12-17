/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js64dataformat;

/**
 *
 * @author PC
 */
public class JS64DataFormat {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Phone number: ");
        String phone = Validation.checkInputPhone();
        System.out.print("Date: ");
        String date = Validation.checkInputDate();
        System.out.print("Email: ");
        String email = Validation.checkInputEmail();
    }
}
