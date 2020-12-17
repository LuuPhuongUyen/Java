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
public class updateBookAction {

    private String bookID, title, author, publisher, year, category, language, preview, picture, content;
    private List<Book> listbook;
    Book bo = new Book();

    public updateBookAction() {
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

    public Book getBo() {
        return bo;
    }

    public void setBo(Book bo) {
        this.bo = bo;
    }

    public String execute() throws Exception {
        bookDAO bdao = new bookDAO();
        bo = bdao.getBook(bookID);
        System.out.println(bo.getPreview());
        if (bo != null) {
            return "success";
        } else {
            return "false";
        }
    }

    public String doUpdate() {
        bookDAO bdao = new bookDAO();
        System.out.println(preview);
        bdao.updateBook(bookID, title, author, publisher, year, category, language, preview, picture, content);
        return "success";

    }

}
