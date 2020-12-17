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
public class GetBookAction {
    public static List<Book> listAllBook;
     private String bookID;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String category;
    private String language;
    private String preview;
    private String picture;
    private String content;
    public GetBookAction() {
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Book> getListAllBook() {
        return listAllBook;
    }

    public void setListAllBook(List<Book> listAllBook) {
        this.listAllBook = listAllBook;
    }
    
    public String execute() throws Exception {
        bookDAO bdao = new bookDAO();
        listAllBook = bdao.getAllBook();
        System.out.println(title);
//        System.out.println(listAllBook.size());
        return "success";
    }
    
}
