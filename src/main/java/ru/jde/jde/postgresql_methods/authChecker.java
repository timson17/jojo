package ru.jde.jde.postgresql_methods;

import java.sql.*;

public class authChecker {
    public boolean checkAuth(String email, String hashPswd) {
        String connect = "jdbc:postgresql://localhost:2020/postgres?user=postgres&password=12345678";
        try {
            Connection con = DriverManager.getConnection(connect);
            PreparedStatement ps = con.prepareStatement("SELECT email, password from users where email = ? and password = ?");
            ps.setString(1, email);
            ps.setString(2, hashPswd);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            // Обработка исключения
            e.printStackTrace(); // или другие действия по обработке исключения
            return false;
        }
    }
}
