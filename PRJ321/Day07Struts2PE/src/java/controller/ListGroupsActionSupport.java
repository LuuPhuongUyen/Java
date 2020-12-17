/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import java.util.List;
import model.Group;

/**
 *
 * @author PC
 */
public class ListGroupsActionSupport extends ActionSupport {

    public static List<Group> gList;
    private Group g = new Group();

    public ListGroupsActionSupport() {
    }

    public String execute() throws Exception {
        gList = g.getAllGroup();
        return "success";
    }

    public static List<Group> getgList() {
        return gList;
    }

    public static void setgList(List<Group> gList) {
        ListGroupsActionSupport.gList = gList;
    }

    public Group getG() {
        return g;
    }

    public void setG(Group g) {
        this.g = g;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }

}
