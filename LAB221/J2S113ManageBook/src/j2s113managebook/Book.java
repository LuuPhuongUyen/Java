/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s113managebook;

/**
 *
 * @author PC
 */
public class Book {

    private String bookCode;
    private String bookName;
    private String author;
    private String publisher;
    private int publishYear;
    private boolean forRent;

    public Book() {
    }

    public Book(String bookCode, String bookName, String author, String publisher, int publishYear, boolean forRent) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.forRent = forRent;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public boolean isForRent() {
        return forRent;
    }

    public void setForRent(boolean forRent) {
        this.forRent = forRent;
    }
    @Override
    public String toString() {
        return bookName; //To change body of generated methods, choose Tools | Templates.
    }
}
