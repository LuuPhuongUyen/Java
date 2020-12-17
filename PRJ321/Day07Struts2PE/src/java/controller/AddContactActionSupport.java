/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Validate.Validate;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.Contact;

/**
 *
 * @author PC
 */
public class AddContactActionSupport extends ActionSupport {
    
    private String fName, lName, phone, error;
    private int group;
    private List<Contact> cList;
    private Contact c = new Contact();
    
    public AddContactActionSupport() {
    }
    
    public String execute() throws Exception {
        Contact ct = new Contact();
        String ePhone = "Phone only contains 10 digits. ";
        String eString = "Not empty. ";
        if (!Validate.checkPhone(phone)) {
            if (error != null) {
                error += ePhone;
            } else {
                error = ePhone;
            }
        }
        if (!Validate.checkString(fName) || !Validate.checkString(lName) || !Validate.checkString(phone)) {
            if (error != null) {
                error += eString;
            } else {
                error = eString;
            }
        }
        if (error != null) {
            return "error";
        }
        if (ct.addContact(c)) {
            cList = ct.getAllContact();
            return "success";
        }
        return "fail";
    }
    
}
