package model;

import java.sql.*;
import java.util.*;
import static model.DatabaseInfo.*;

public class BookDB {
    //--------------------------------------------------------------------

    public static Book getBook(String bid) {
        try {
            Book book = null;
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT Title, Author, Category, Keyword FROM Books WHERE BookID=?");
            stmt.setString(1, bid);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                book = new Book(bid, rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4));
            }
            con.close();
            return book;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //--------------------------------------------------------------------   

    public static Vector<Vector> searchByCategory(String cat) {
        try {
            Vector<Vector> list = new Vector<>();
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT BookID, Title, Author, Keyword FROM Books WHERE Category=?");
            stmt.setString(1, cat);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vector vc = new Vector();
                vc.addElement(rs.getString(1));
                vc.addElement(rs.getString(2));
                vc.addElement(rs.getString(3));
                vc.addElement(rs.getString(4));
                list.add(vc);
            }
            con.close();
            return list;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //-------------------------------------------------------------------- 

    public static ArrayList<Book> searchByKeyword(String key) {
        try {
            ArrayList<Book> list = new ArrayList<>();
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT BookID, Title, Author, Category FROM Books WHERE Keyword=(?);");
            stmt.setString(1, key);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Book book = new Book(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), key);
                list.add(book);
            }
            con.close();
            return list;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //--------------------------------------------------------------------   

    public static Vector<Vector> searchByTitle(String title) {
        try {
            Vector<Vector> list = new Vector<>();
            int i = 0;
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT BookID, Author, Category, Keyword FROM Books WHERE Title=(?);");
            stmt.setString(1, title);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vector element = new Vector();
                element.addElement(rs.getString(1));
                element.addElement(rs.getString(2));
                element.addElement(rs.getString(3));
                element.addElement(rs.getString(4));
                list.addElement(element);
                i++;
            }
            con.close();
            return list;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //--------------------------------------------------------------------  

    public static boolean addNewBook(Book b) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Books(BookID, Title, Author, Category, Keyword)"
                    + " VALUES(?, ?, ?, ?, ?)");
            stmt.setString(1, b.getBookID());
            stmt.setString(2, b.getTitle());
            stmt.setString(3, b.getAuthor());
            stmt.setString(4, b.getCategory());
            stmt.setString(5, b.getKeyword());
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //--------------------------------------------------------------------  
    public static boolean deleteBook(String bid) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Delete FROM Books where BookID = ?");
            stmt.setString(1, bid);
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
