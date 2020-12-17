/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import model.Group;
import java.util.List;

/**
 *
 * @author PC
 */
public class ListGroupsActionSupport extends ActionSupport {

    public static List<Group> dsn;
    private Group daog = new Group();

    public ListGroupsActionSupport() {
    }

    public ListGroupsActionSupport(List<Group> dsn) {
        this.dsn = dsn;
    }

    public List<Group> getDsn() {
        return dsn;
    }

    public void setDsn(List<Group> dsn) {
        this.dsn = dsn;
    }

    public Group getDao() {
        return daog;
    }

    public void setDao(Group daog) {
        this.daog = daog;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }

    @Override
    public String execute() throws Exception {
        dsn = daog.getAllGroup();
        return "success";
    }

}
