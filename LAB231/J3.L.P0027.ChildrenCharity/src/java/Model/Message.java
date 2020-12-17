/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Luu Phuong Uyen
 */
public class Message {
    private int id;
    private String username;
    private String email;
    private String message;

    public Message() {
    }

    public Message(int id, String username, String email, String message) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.message = message;
    }

    public Message(String username, String email, String message) {
        this.username = username;
        this.email = email;
        this.message = message;
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

    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", name=" + username + ", email=" + email + ", message=" + message + '}';
    }

   

    
    

}
