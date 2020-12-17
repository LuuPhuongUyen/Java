/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js76.csvfileformat;

/**
 *
 * @author PC
 */
public class CSV {
    private int ID;
    private String name;
    private String email;
    private String phone;
    private String address;

    public CSV() {
    }

    public CSV(int ID, String name, String email, String phone, String address) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
