package org.driivz.infra;

import java.sql.*;

public class DBQueries {
    private static Connection connect;

    public static Connection getConnection() {
        if (connect == null)
            return connect();
        return connect;
    }

    private static Connection connect() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://10.0.0.1:9090", "user", "1234");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String executeQuery(String query) {
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            return rs.getString(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static ResultSet getResultSet(String query) {
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            return rs;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void closeConnection() {
        try {
            getConnection().close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
