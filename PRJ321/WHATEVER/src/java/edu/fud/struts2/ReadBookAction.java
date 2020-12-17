/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.struts2;

import edu.fud.DAO.bookDAO;
import edu.fud.model.Book;

/**
 *
 * @author Admin
 */
public class ReadBookAction {
    String bookID,content;
    public ReadBookAction() {
    }

    public ReadBookAction(String bookID, String content) {
        this.bookID = bookID;
        this.content = content;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String execute() throws Exception {
        System.out.println(bookID);
        bookDAO bdao = new bookDAO();
        Book b = bdao.getBook(bookID);
        content=b.getContent();
        System.out.println(content);
        if (content != null) {
            return "success";
        }
        return "fail";
    }
    
}
