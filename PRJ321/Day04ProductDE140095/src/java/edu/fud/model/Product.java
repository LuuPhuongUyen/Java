/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Product {

    private String productID;
    private String productName;
    private String unit;
    private int price;

    public Product() {
    }

    public Product(String productID, String productName, String unit, int price) {
        this.productID = productID;
        this.productName = productName;
        this.unit = unit;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static ArrayList<Product> getAll() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            Product p = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PRJ321_DE140095;", "uyenlp", "abcd");
            PreparedStatement stmt = con.prepareStatement("SELECT * From Product_DE140095");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Product pd = new Product(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                products.add(pd);
            }
            con.close();
            return products;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean addNewProduct(Product p) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PRJ321_DE140095;", "uyenlp", "abcd");
            PreparedStatement stmt = con.prepareStatement("Insert into Product_DE140095(ProductID, ProductName, Unit, Price)"
                    + " VALUES(?, ?, ?, ?)");
            stmt.setString(1, p.getProductID());
            stmt.setString(2, p.getProductName());
            stmt.setString(3, p.getUnit());
            stmt.setInt(4, p.getPrice());
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
