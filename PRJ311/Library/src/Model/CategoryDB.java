/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.ArrayList;
import static model.DatabaseInfo.*;

/**
 *
 * @author PC
 */
public class CategoryDB {

    public static ArrayList<Category> getAll() {
        ArrayList<Category> categories = new ArrayList<>();
        try {
            model.Book book = null;
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT * From Category");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getString(1), rs.getString(2));
                categories.add(category);
            }
            con.close();
            return categories;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
