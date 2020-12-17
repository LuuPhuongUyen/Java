/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursespe;

import static coursespe.DatabaseInfo.dbURL;
import static coursespe.DatabaseInfo.driverName;
import static coursespe.DatabaseInfo.passDB;
import static coursespe.DatabaseInfo.userDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class Course {

    private String courseID, subject, lectureName;
    private Date startDate;

    public Course() {
    }

    public Course(String courseID, String subject, String lectureName, Date startDate) {
        this.courseID = courseID;
        this.subject = subject;
        this.lectureName = lectureName;
        this.startDate = startDate;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public static Vector<Vector> getAll() {
        try {
            Vector<Vector> gAll = new Vector<>();
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Courses");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vector log = new Vector();
                log.addElement(rs.getString(1));
                log.addElement(rs.getString(2));
                log.addElement(rs.getString(3));
                log.addElement(rs.getDate(4));
                gAll.addElement(log);
            }
            con.close();
            return gAll;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean update(String cId, String lectureName) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("UPDATE Courses SET LectureName=? WHERE CourseID=?");
            stmt.setString(1, lectureName);
            stmt.setString(2, cId);
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
