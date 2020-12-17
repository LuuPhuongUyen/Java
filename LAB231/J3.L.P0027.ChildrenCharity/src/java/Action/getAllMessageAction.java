/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DAO.MessageDAO;
import Model.Message;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getAllMessageAction {

    private int id;
    private String name;
    private String email;
    private String message;
    private ArrayList<Message> lsMess = new ArrayList<>();

    public getAllMessageAction() {
    }

    public getAllMessageAction(int id, String name, String email, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Message> getLsMess() {
        return lsMess;
    }

    public void setLsMess(ArrayList<Message> lsMess) {
        this.lsMess = lsMess;
    }

    public String execute() throws Exception {
        MessageDAO mess = new MessageDAO();
        lsMess = mess.getAllMessage();
        return "success";
    }

}
