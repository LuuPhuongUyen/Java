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
 * @author Admin
 */
public class SearchBookAction {

    private String searchValue;
    private List<Book> listBooks;

    public SearchBookAction() {
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public List<Book> getListBooks() {
        return listBooks;
    }

    public void setListBooks(List<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public String execute() throws Exception {
        bookDAO bdao = new bookDAO();
        listBooks = bdao.searchBook("%" + searchValue + "%");
        if (listBooks.size() != 0) {
            return "success";
        }
        return "fail";
    }

}
