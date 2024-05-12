package ru.jde.jde.postgresql_methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class putNiggerToTable {

    public String addNiggerToTable(int owner_id, String name, int power, int evasion, int health) {
        String connect = "jdbc:postgresql://192.168.0.129:2020/postgres?user=postgres&password=12345678";
        try {
            Connection con = DriverManager.getConnection(connect);
            PreparedStatement ps = con.prepareStatement("INSERT INTO units (name, power, evasion, health, owner_id ) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setInt(2, power);
            ps.setInt(3, evasion);
            ps.setInt(4, health);
            ps.setInt(5, owner_id);

            ps.executeUpdate();

            // Дополнительные действия с подключением к базе данных

        } catch (SQLException e) {
            // Обработка исключения
            e.printStackTrace(); // или другие действия по обработке исключения
        }

        //return "Пользователь создан";
        return "Для пользователя: " + owner_id + " зверь с именем: " + name;
    }


}
