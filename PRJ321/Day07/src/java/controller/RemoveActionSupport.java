/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import model.Contact;
import java.util.List;

/**
 *
 * @author PC
 */
public class RemoveActionSupport extends ActionSupport{
    private int id;
    private List<Contact> dsll;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Contact> getDsll() {
        return dsll;
    }

    public void setDsll(List<Contact> dsll) {
        this.dsll = dsll;
    }

    
    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }

    @Override
    public String execute() throws Exception {
        Contact ct = new Contact();
        ct.deleteContact(id);
        dsll = ct.getAllContact();
        return "success";
    }
    
}
