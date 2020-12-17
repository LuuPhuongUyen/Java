/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneNumber;

/**
 *
 * @author PC
 */
public class IntPhoneNumber extends PhoneNumber {

    String countryCode;

    public IntPhoneNumber() {
        super();
    }

    public IntPhoneNumber(int area, String number) {
        super(area, number);
    }

    public IntPhoneNumber(String countryCode, int area, String number) {
        super(area, number);
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return this.countryCode + "-" + super.toString();
    }

    public IntPhoneNumber inputData() {
        System.out.print("Enter country code: ");
        Validation.in.nextLine();
        countryCode = Validation.checkInputString().trim();
        System.out.print("Enter area code: ");
        area = Validation.checkInputInt();
        Validation.in.nextLine();
        System.out.print("Enter number: ");
        number = Validation.checkInputString().trim();
        return this;
    }

    @Override
    public void display() {
        System.out.printf("%s - %d - %s\n", countryCode, area, number);
    }
}
