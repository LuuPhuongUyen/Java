/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.model;

import java.util.Date;

/**
 *
 * @author Hoang My
 */
public class Library {

    private String userID;
    private String bookID;
    private Date time;

    public Library() {
    }

    public Library(String userID, String bookID, Date time) {
        this.userID = userID;
        this.bookID = bookID;
        this.time = time;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void print() {
        System.out.println("BookID : " + getBookID() + "Time: " + getTime());
    }
}
