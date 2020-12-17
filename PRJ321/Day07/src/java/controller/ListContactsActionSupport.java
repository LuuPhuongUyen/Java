/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.Contact;

import java.util.List;

/**
 *
 * @author PC
 */
public class ListContactsActionSupport extends ActionSupport{
    private List<Contact> dsll;
    private Contact ci = new Contact();
    private Contact dao = new Contact();

    public ListContactsActionSupport() {
    }

    public List<Contact> getDsll() {
        return dsll;
    }

    public void setDsll(List<Contact> dsll) {
        this.dsll = dsll;
    }

    public Contact getCi() {
        return ci;
    }

    public void setCi(Contact ci) {
        this.ci = ci;
    }

    public Contact getDao() {
        return dao;
    }

    public void setDao(Contact dao) {
        this.dao = dao;
    }

    @Override
    public String execute() throws Exception {
        dsll = dao.getAllContact();
        return "success";
    }
}
