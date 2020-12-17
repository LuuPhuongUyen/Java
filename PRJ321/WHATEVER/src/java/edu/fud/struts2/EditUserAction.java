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
 * @author Hung Nguyen
 */
public class EditUserAction {
       private int userID;
       private String name;
       private String Username;
       private String email;
       private String password;
       User u=new User();
//    private List<User>us;

    public EditUserAction() {
    }

    public EditUserAction(int userID, String name, String Username, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.Username = Username;
        this.email = email;
        this.password = password;
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

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getU() {
        return u;
    } 

    public void setU(User u) {
        this.u = u;
    }

     public String execute() throws  Exception{
        userDAO ud = new userDAO();
       u =ud.getUserbyID(userID);
         System.out.println(u.getName()+" "+u.getPassword());
        if(u != null){
            return "success"; 
        }else{
            return "false";
        }
        
    }
    
    public String update() throws Exception{
        userDAO ud = new userDAO();
       ud.UpdateProfile(name, Username,password, email,userID);
       return "success";
      
    }
   
    
    
}
