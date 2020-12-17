/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.model;

import static edu.fud.model.DatabaseInfo.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Student {

    private int ID;
    private String name;
    private boolean gender;
    private Date dob;

    public Student() {
    }

    public Student(int ID, String name, boolean gender, Date dob) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isMale() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public static Student getStudent(int id) {
        try {
            Student s = null;
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT Name, Gender, DOB FROM Student_DE140095 WHERE ID=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                s = new Student(id, rs.getString(1), rs.getBoolean(2), rs.getDate(3));
            }
            con.close();
            return s;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Student> getAll() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT * From Student_DE140095");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Student s = new Student(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4));
                students.add(s);
            }
            con.close();
            return students;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addStudent(Student s) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Insert into Student_DE140095( Name, Gender, DOB)"
                    + " VALUES( ?, ?, ?)");
            stmt.setString(1, s.getName());
            stmt.setBoolean(2, s.getGender());
            stmt.setDate(3, s.getDob());
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateStudent(Student s) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement("Update Student_DE140095 set Name=?, Gender=?, DOB=? where ID=?");
            stmt.setString(1, s.getName());
            stmt.setBoolean(2, s.getGender());
            stmt.setDate(3, s.getDob());
            stmt.setInt(4, s.getID());
            int rc = stmt.executeUpdate();
            if (rc == 1) {
                con.commit();
            } else {
                con.rollback();
            }
            con.close();
            return rc == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteStudent(int id) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Delete FROM Student_DE140095 where ID = ?");
            stmt.setInt(1, id);
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
