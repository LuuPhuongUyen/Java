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
public class BookDemo {

    public static void main(String[] args) {
        Book book = new Book();
        Author author = new Author("Luu Phuong Uyen");
        book.setAuthor(author);
        book.setTitle("ABC");
        book.setNoOfPages(50);
        book.setFiction(true);
        System.out.println(book);
    }
}
