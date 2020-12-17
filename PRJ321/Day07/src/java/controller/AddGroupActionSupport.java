/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Validation.Validation;
import com.opensymphony.xwork2.ActionSupport;
import model.Group;
import java.util.List;

/**
 *
 * @author PC
 */
public class AddGroupActionSupport extends ActionSupport {
    
    String Groupname, description, errorg;
    public List<Group> dsn;
    private Group daog = new Group(Groupname, description);
    
    public String getGroupname() {
        return Groupname;
    }
    
    public void setGroupname(String Groupname) {
        this.Groupname = Groupname;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getErrorg() {
        return errorg;
    }
    
    public void setErrorg(String errorg) {
        this.errorg = errorg;
    }
    
    public List<Group> getDsn() {
        return dsn;
    }
    
    public void setDsn(List<Group> dsn) {
        this.dsn = dsn;
    }
    
    public Group getDaog() {
        return daog;
    }
    
    public void setDaog(Group daog) {
        this.daog = daog;
    }
    
    public String execute() throws Exception {
        String erString = "Not empty.";
        System.out.println("name= " + Groupname + "  " + description);
        if (!Validation.checkString(Groupname) || !Validation.checkString(description)) {
            if (errorg != null) {
                errorg += erString;
            } else {
                errorg = erString;
            }
        }
        if (errorg != null) {
            return "error";
        }
        if (daog.addGroup(Groupname, description)) {
            dsn = daog.getAllGroup();
            return "success";
        }
        return "fail";
    }
}
