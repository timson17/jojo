package ru.jde.jde.postgresql_methods;

import java.sql.*;

public class createUser {

    public String addUserToDatabase(String email, String password) {
        String first_name = null;
        String last_name = null;
        String connect = "jdbc:postgresql://localhost:2020/postgres?user=postgres&password=mysecretpassword";
        try {
            Connection con = DriverManager.getConnection(connect);
            PreparedStatement ps = con.prepareStatement("INSERT INTO users (first_name, last_name, email, password) VALUES (?, ?, ?, ?)");
            ps.setString(1, first_name);
            ps.setString(2, last_name);
            ps.setString(3, email);
            ps.setString(4, password);

            ps.executeUpdate();

            // Дополнительные действия с подключением к базе данных

        } catch (SQLException e) {
            // Обработка исключения
            e.printStackTrace(); // или другие действия по обработке исключения
        }

        return "Пользователь создан";
    }
}

