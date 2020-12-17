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
public class SearchByCategoryAction {
    private String category;
    private List<Book> listBooks;
    
    public SearchByCategoryAction() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Book> getListBooks() {
        return listBooks;
    }

    public void setListBooks(List<Book> listBooks) {
        this.listBooks = listBooks;
    }
    
    public String execute() throws Exception {
        bookDAO bdao = new bookDAO();
        System.out.println(category);
        listBooks = bdao.searchByCategory(category);
        System.out.println(listBooks.size());
        if (listBooks.size() != 0) {
            return "success";
        }
        return "fail";
    }
    
}
