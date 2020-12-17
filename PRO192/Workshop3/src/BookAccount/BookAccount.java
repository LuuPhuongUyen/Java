/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookAccount;

/**
 *
 * @author PC
 */
public class BookAccount {

    public static void main(String[] args) {
        Author aut1 = new Author("J. K. Rowling", "jkrowling@nowhere.com", 'F');
        Book book1 = new Book("Harry Potter", aut1, 278, 28);
        book1.setPrice(29.95);
        book1.setQty(30);
        System.out.println(book1);
    }
}
