package ru.jde.jde.postgresql_methods;

import java.sql.*;

public class getNiggerList {
    public ResultSet getNiggers(Integer id) throws SQLException {
        String connect = "jdbc:postgresql://192.168.0.129:2020/postgres?user=postgres&password=12345678";

            Connection con = DriverManager.getConnection(connect);
            PreparedStatement ps = con.prepareStatement("SELECT * from units where owner_id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return rs;
    }
}

