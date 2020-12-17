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
public class getUserAction {

    private int userID;
    private String name;
    private String userName;
    private String password;
    private String email;
    private int userRight;
    private List<User> listAllUser;

    public getUserAction() {
    }

    public getUserAction(int userID, String name, String userName, String password, String email, int userRight, List<User> listAllUser) {
        this.userID = userID;
        this.name = name;
        this.userName = userName;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    

    public String execute() throws Exception {
        userDAO ud = new userDAO();
        listAllUser = ud.getAllUser();
        System.out.println(listAllUser);
        return "success";
    }

}
