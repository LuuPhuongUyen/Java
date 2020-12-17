package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseInfo {

    public static Connection openConnection() throws Exception {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Day05Struts;"
                + "User=uyenlp;Password=abcd";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(connectionUrl);
        return con;
    }
}
