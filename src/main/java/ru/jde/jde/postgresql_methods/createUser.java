package ru.jde.jde.postgresql_methods;

import java.sql.*;

public class createUser {

    public String addUserToDatabase(String email, String hashpswd, String firstname, String lastname) {
        String connect = "jdbc:postgresql://localhost:2020/postgres?user=postgres&password=mysecretpassword";
        try {
            Connection con = DriverManager.getConnection(connect);
            PreparedStatement ps = con.prepareStatement("INSERT INTO users (first_name, last_name, email, password) VALUES (?, ?, ?, ?)");
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, email);
            ps.setString(4, hashpswd);

            ps.executeUpdate();

            // Дополнительные действия с подключением к базе данных

        } catch (SQLException e) {
            // Обработка исключения
            e.printStackTrace(); // или другие действия по обработке исключения
        }

        return "Пользователь создан";
    }
}

