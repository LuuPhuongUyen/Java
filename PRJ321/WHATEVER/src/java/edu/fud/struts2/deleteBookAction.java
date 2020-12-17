/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.struts2;

import edu.fud.DAO.bookDAO;
import edu.fud.model.Book;
import java.util.List;

/**
 *
 * @author Hoang My
 */
public class deleteBookAction {

    private String bookID;
    private List<Book> listAllBook;
    
    public deleteBookAction() {
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public List<Book> getListAllBook() {
        return listAllBook;
    }

    public void setListAllBook(List<Book> listAllBook) {
        this.listAllBook = listAllBook;
    }

    public String execute() throws Exception {
        bookDAO bd = new bookDAO();
        if (bd.deleteBook(bookID)) {
            listAllBook = bd.getAllBook();
            return "success";

        } else {
            return "fail";
        }
    }

}
