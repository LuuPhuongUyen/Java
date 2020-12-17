/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s113managebook;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class BookList {

    private ArrayList<Book> books = new ArrayList<>();

    public BookList() {
        books.add(new Book("B001", "Java core - Part 1", "Andrei Chang", "Standford University", 2000, false));
        books.add(new Book("B002", "Java core - Part 2", "Anna", "University", 2002, true));
        books.add(new Book("B003", "Java Server Pages", "Hans", "University of Cambridge", 2003, true));
        books.add(new Book("B004", "JSP and MVC model", "Budi", "Brainy Software", 2004, false));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<String> getName() {
        ArrayList<String> BooksNames = new ArrayList<>();
        for (Book book : books) {
            BooksNames.add(book.getBookName());
        }
        return BooksNames;
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public boolean UpdateAdd(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookCode().equals(book.getBookCode())) {
                books.set(i, book);
                return false;
            }
        }
        books.add(book);
        return true;
    }
}
