/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.DAO;

import edu.fud.connect.DBUtil;
import edu.fud.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang My
 */
public class bookDAO {

  public static boolean addNewBook(Book b) throws Exception {
        try {
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO Book(BookID, Title, Author,Publisher,Year,Category,Language,Preview,Picture,Content)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, b.getBookID());
            stmt.setString(2, b.getTitle());
            stmt.setString(3, b.getAuthor());
            stmt.setString(4, b.getPublisher());
            stmt.setString(5, b.getYear());
            stmt.setString(6, b.getCategory());
            stmt.setString(7, b.getLanguage());
            stmt.setString(8, b.getPreview());
            stmt.setString(9, b.getPicture());
            stmt.setString(10, b.getContent());
            int rowCount = stmt.executeUpdate();
            con.close();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deleteBook(String bid) {
        try {
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement("Delete FROM Book where BookID = ?");
            stmt.setString(1, bid);
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (Exception ex) {
            Logger.getLogger(bookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static int updateBook(String bookID, String title, String author, String publisher, String year, String category, String language, String preview, String picture, String content) {
        int rc = 0;
        try {
            Connection con = DBUtil.openConnection();
            String sql = "UPDATE Book SET Title = ?, Author = ?,Publisher = ?,Year = ?,Category = ?,Language = ?,Preview = ?,Picture = ?,Content = ? Where BookID ='" + bookID + "'";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setString(3, publisher);
            stmt.setString(4, year);
            stmt.setString(5, category);
            stmt.setString(6, language);
            stmt.setString(7, preview);
            stmt.setString(8, picture);
            stmt.setString(9, content);
            rc = stmt.executeUpdate();
            con.close();
            System.out.println("Updated Book successfully!");
        } catch (Exception ex) {
            System.out.println("Update Book failed!");
        }
        return rc;
    }

    public static Book getBook(String bid) {
        try {
            Book book = null;
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Book WHERE BookID=?");
            stmt.setString(1, bid);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                book = new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }
            con.close();
            return book;

        } catch (Exception ex) {
            Logger.getLogger(bookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<Book> getAllBook() {
        try {
            Book book = null;
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Book");
            ResultSet rs = stmt.executeQuery();
            List<Book> list = new ArrayList<Book>();
            while (rs.next()) {
                book = new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(book);
            }
            con.close();
            return list;

        } catch (Exception ex) {
            Logger.getLogger(bookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<Book> searchByCategory(String cat) {
        try {
            Book book = null;
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "SELECT * FROM Book WHERE Category =?");
            stmt.setString(1, cat);
            ResultSet rs = stmt.executeQuery();
            List<Book> list = new ArrayList<Book>();
            while (rs.next()) {
                book = new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(book);
            }
            con.close();
            return list;

        } catch (Exception ex) {
            Logger.getLogger(bookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    // --------------------------------------------------------------------
    public static List<Book> searchBook(String search) {
        try {
            Book book = null;
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Book WHERE Title like ? or Author like ?");
            stmt.setString(1, "%" + search + "%");
            stmt.setString(2, "%" + search + "%");
            ResultSet rs = stmt.executeQuery();
            List<Book> list = new ArrayList<Book>();
            while (rs.next()) {
                book = new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(book);
            }
            con.close();
            return list;

        } catch (Exception ex) {
            Logger.getLogger(bookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<String> listCategory() {
        try {
            Book book = null;
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "select distinct category from book");
            ResultSet rs = stmt.executeQuery();
            List<String> list = new ArrayList<String>();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
            con.close();
            return list;

        } catch (Exception ex) {
            Logger.getLogger(bookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
