 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.struts2;

import com.opensymphony.xwork2.ActionSupport;
import edu.fud.DAO.userDAO;

/**
 *
 * @author Hung Nguyen
 */
public class SignUpAction extends ActionSupport{
  
    private String UserName;
    private String Name;
    private String Password;
    private String Email;
    private final String FAIL = "fail";
    private final String SUCCESS ="success";
    public SignUpAction() {
    }

    public SignUpAction(String UserName, String Name, String Password, String Email) {
        this.UserName = UserName;
        this.Name = Name;
        this.Password = Password;
        this.Email = Email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String execute() throws Exception {
        userDAO dao = new userDAO();
        System.out.println(Name+"  "+UserName+"  "+Password+"  "+Email);
        boolean result = dao.addNewUser( Name, UserName, Password, Email);
        if(result)
        {
            return "success";
            
        }
        return "fail";
    }


    }
    
   

