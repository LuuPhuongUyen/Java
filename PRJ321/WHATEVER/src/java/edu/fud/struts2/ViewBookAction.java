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
public class ViewBookAction {

    String bookID, title, author, publisher;
    String year;
    String category, language, preview, picture, content;

    public ViewBookAction(String bookID, String title, String author, String publisher, String year, String category, String language, String preview, String picture, String content) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.category = category;
        this.language = language;
        this.preview = preview;
        this.picture = picture;
        this.content = content;
    }

    public ViewBookAction() {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    public String execute() throws Exception {
        bookDAO bdao = new bookDAO();
        Book b = bdao.getBook(bookID);
        title = b.getTitle();
        author = b.getAuthor();
        publisher = b.getPublisher();
        year = b.getYear();
        category = b.getCategory();
        language = b.getLanguage();
        preview = b.getPreview();
        picture = b.getPicture();
        content = b.getContent();
        System.out.println(bookID);
        if (b != null) {
            return "success";
        }
        return "fail";

    }

//    public String readBook() throws Exception {
//        bookDAO bdao = new bookDAO();
//        Book b = bdao.getBook(bookID);
//        if (content != null) {
//            return "success";
//        }
//        return "fail";
//    }
}
