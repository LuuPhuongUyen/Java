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
public class updateUserAction {

    private int userID;
    private String name;
    private String userName;
    private String email;
    private int userRight;
    private List<User> listAllUser;
    private User US = new User();

    public updateUserAction() {
    }

    public updateUserAction(int userID, String name, String userName, String email, int userRight, List<User> listAllUser) {
        this.userID = userID;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.userRight = userRight;
        this.listAllUser = listAllUser;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

   
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserRight() {
        return userRight;
    }

    public void setUserRight(int userRight) {
        this.userRight = userRight;
    }

    public List<User> getListAllUser() {
        return listAllUser;
    }

    public void setListAllUser(List<User> listAllUser) {
        this.listAllUser = listAllUser;
    }

    public User getUS() {
        return US;
    }

    public void setUS(User US) {
        this.US = US;
    }

    public String execute() throws Exception {
        userDAO ud = new userDAO();
        US = ud.getUserbyID(userID);
        System.out.println(US);
        if (US != null) {
            return "success";
        } else {
            return "false";
        }
    }

    public String doUpdate() {
        userDAO ud = new userDAO();
        ud.updateUser(userID, name, userName, email, userRight);
        return "success";
    }
}
