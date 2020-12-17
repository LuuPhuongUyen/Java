/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.Contact;

/**
 *
 * @author Admin
 */
public class ListContactsActionSupport extends ActionSupport {

    private List<Contact> cList;
    private Contact c = new Contact();

    public ListContactsActionSupport() {
    }

    public List<Contact> getcList() {
        return cList;
    }

    public void setcList(List<Contact> cList) {
        this.cList = cList;
    }

    public Contact getC() {
        return c;
    }

    public void setC(Contact c) {
        this.c = c;
    }

    @Override
    public String execute() throws Exception {
        cList = c.getAllContact();
        return "success";
    }
}
