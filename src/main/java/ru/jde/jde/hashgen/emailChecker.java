package ru.jde.jde.hashgen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class emailChecker {
    public boolean checkEmail(String email) {
        String connect = "jdbc:postgresql://localhost:2020/postgres?user=postgres&password=mysecretpassword";
        try {
            Connection con = DriverManager.getConnection(connect);
            PreparedStatement ps = con.prepareStatement("SELECT email from users where email = ?");
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String res = rs.getString(1);

                // Дополнительные действия с результатом

                return true;
            } else {
                boolean boolEmail = false;
                return boolEmail;
            }

        } catch (SQLException e) {
            // Обработка исключения
            e.printStackTrace(); // или другие действия по обработке исключения
            return false;
        }
    }
}
