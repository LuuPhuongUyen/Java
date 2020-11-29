/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookDemo;

/**
 *
 * @author PC
 */
public class Book {

    private Author author;
    private String title;
    private int noOfPages;
    private boolean fiction;

    public Book() {
    }

    public Book(Author author, String title, int noOfPages, boolean fiction) {
        this.author = author;
        this.title = title;
        this.noOfPages = noOfPages;
        this.fiction = fiction;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public boolean isFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", " + author + ", " + noOfPages + " pages" + ", Fiction: " + fiction;
    }

}
