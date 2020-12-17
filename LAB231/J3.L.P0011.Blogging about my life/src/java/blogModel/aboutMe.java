/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogModel;

import Connection.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class aboutMe {

    String detail;
    String name;

    public aboutMe() {
    }

    public aboutMe(String detail, String name) {
        this.detail = detail;
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public aboutMe getMe() throws ClassNotFoundException, SQLException, Exception {
        Connection con = DBUtil.openConnection();
        PreparedStatement stmt = con.prepareStatement("Select * from aboutMe");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            detail = rs.getString("detail");
            name = rs.getString("name");
            aboutMe x = new aboutMe(detail, name);
            return x;
        }
        con.close();
        return null;
    }
}
