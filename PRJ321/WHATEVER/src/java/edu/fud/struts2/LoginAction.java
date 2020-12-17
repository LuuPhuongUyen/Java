/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.struts2;

import com.opensymphony.xwork2.ActionContext;
import edu.fud.DAO.RegistrationDAO;
import edu.fud.DAO.userDAO;
import edu.fud.model.User;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Hung Nguyen
 */
public class LoginAction {

    private String username = null;
    private String password;
    private final String FAIL = "fail";
    private final String SUCCESS = "success";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginAction() {
    }

    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();
        userDAO udao = new userDAO();
        boolean result = dao.checkLogin(username, password);
        Map session = ActionContext.getContext().getSession();
        User u = udao.getUserbyUserName(username);
        String URL = FAIL;
        if (result) {
            session.put("NAME", u.getName());
            session.put("ID", u.getUserID());
            URL = SUCCESS;
            if(u.getUserRight()==1) 
                session.put("permission", true);
            else session.put("permission", false);
        }
        return URL;
    }

    public String logOut() {
        Map session = ActionContext.getContext().getSession();
        session.remove("NAME");
        session.remove("ID");
        session.remove("permission");
        return SUCCESS;
    }

}
