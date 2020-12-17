/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Validation.Validation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import model.Contact;
import java.util.List;

/**
 *
 * @author PC
 */
public class AddContactActionSupport extends ActionSupport {

    private String first, last, phone, error;
    private int group;
    private List<Contact> dsll;

    public AddContactActionSupport() {
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }

    public List<Contact> getDsll() {
        return dsll;
    }

    public void setDsll(List<Contact> dsll) {
        this.dsll = dsll;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String execute() throws Exception {
        Contact ct = new Contact();
        String ePhone = "Phone number contains 10 digits.";
        String eString = " Not empty.";
        if (!Validation.checkPhone(phone)) {
            if (error != null) {
                error += ePhone;
            } else {
                error = ePhone;
            }
        }
        if (!Validation.checkString(first) || !Validation.checkString(last) || !Validation.checkString(phone)) {
            if (error != null) {
                error += eString;
            } else {
                error = eString;
            }
        }
        if (error != null) {
            return "error";
        }
        if (ct.addContact(first, last, group, phone)) {
            dsll = ct.getAllContact();
            return "success";
        }
        return "fail";
    }

}
