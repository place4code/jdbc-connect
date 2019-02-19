package com.company;

import java.sql.*;

public class DAO {

    private final String dburl = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private final String user = "root";
    private final String pass = "";
    private final String driver = "com.mysql.jdbc.Driver";


    private String query = "SELECT * FROM jdbc_table";


    public boolean connect() {
        try {
            Class.forName(driver).newInstance(); //deprecated
            Connection connection = DriverManager.getConnection(dburl, user, pass);
            System.out.println("Connection ok!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            return true;
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
