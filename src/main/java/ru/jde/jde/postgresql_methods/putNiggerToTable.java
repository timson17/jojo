package ru.jde.jde.postgresql_methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class putNiggerToTable {

    public String addNiggerToTable(int owner_id, String name, int power, int evasion, int health) {
        String connect = "jdbc:postgresql://localhost:2020/postgres?user=postgres&password=12345678";
        try {
            Connection con = DriverManager.getConnection(connect);
            PreparedStatement ps = con.prepareStatement("INSERT INTO units (owner_id, name, power, evasion, health) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, String.valueOf(owner_id));
            ps.setString(2, name);
            ps.setString(3, String.valueOf(power));
            ps.setString(4, String.valueOf(evasion));
            ps.setString(5, String.valueOf(health));

            ps.executeUpdate();

            // Дополнительные действия с подключением к базе данных

        } catch (SQLException e) {
            // Обработка исключения
            e.printStackTrace(); // или другие действия по обработке исключения
        }

        return "Пользователь создан";
}
}
