/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.entity.Message;
import com.model.MessageModel;
import com.opensymphony.xwork2.ActionSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getMessageAction extends ActionSupport {

    private int id;
    private String name;
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

    public Message getMess() {
        return mess;
    }

    public void setMess(Message mess) {
        this.mess = mess;
    }

    public String execute() throws NullPointerException, Exception {
        MessageModel mModel = new MessageModel();
        mess = new Message(name, email, message);
        mModel.insertDB(mess);
        if(mess!=null){
            
            return "success";
        }else{
            
            return "fail";
        }

    }

    @Override
    public void validate() {
        MessageModel mModel = new MessageModel();
        try {
            String s = execute();
            if(mModel.checkEmail(mess.getEmail())==false){
                addActionError("We could not understand the email address.");
            }
            else if(s.equalsIgnoreCase("success")){
                addActionMessage("Thank for your message.");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(getMessageAction.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

   

}
