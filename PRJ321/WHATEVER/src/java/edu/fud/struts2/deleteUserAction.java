/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.struts2;

import edu.fud.DAO.userDAO;
import edu.fud.model.User;
import java.util.List;

/**
 *
 * @author Hoang My
 */
public class deleteUserAction {

    private int userID;
    private List<User> listAllUser;

    public deleteUserAction() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    

    public List<User> getListAllUser() {
        return listAllUser;
    }

    public void setListAllUser(List<User> listAllUser) {
        this.listAllUser = listAllUser;
    }

    public String execute() throws Exception {
        userDAO ud = new userDAO();
        if (ud.deleteUser(userID)) {
            listAllUser=ud.getAllUser();
            return "success";
        } else {
            return "fail";
        }
    }

}
