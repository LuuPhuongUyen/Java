/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.Contact;
import model.ContactDB;

/**
 *
 * @author Luu Phuong Uyen
 */
public class FindAction {

    String address, phone, email;
    ArrayList<Contact> cList = new ArrayList<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Contact> getcList() {
        return cList;
    }

    public void setcList(ArrayList<Contact> cList) {
        this.cList = cList;
    }

    public FindAction() {
    }

    public String execute() throws Exception {
        ContactDB cDB = new ContactDB();
        address = cDB.getContact("Address").get(0).getValue();
        phone = cDB.getContact("Phone").get(0).getValue();
        email = cDB.getContact("Email").get(0).getValue();
        cList = cDB.getContact("work");
        for (Contact c : cList) {
            System.out.println(c.getKey() + ":" + c.getValue());
        }
        return "success";
    }
}
