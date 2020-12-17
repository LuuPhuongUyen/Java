/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DAO.MessageDAO;
import Model.Message;


/**
 *
 * @author Luu Phuong Uyen
 */
public class getMessageAction {
    private int id;
    private String username;
    private String email;
    private String message;
    private Message mess;

    public getMessageAction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Message getMess() {
        return mess;
    }

    public void setMess(Message mess) {
        this.mess = mess;
    }

   

    public String execute() throws NullPointerException, Exception {
        MessageDAO mModel = new MessageDAO();
        mess = new Message(username, email, message);
        mModel.insertDB(mess);
        if(mess!=null){
            
            return "success";
        }else{
            
            return "fail";
        }

    }

    
}
