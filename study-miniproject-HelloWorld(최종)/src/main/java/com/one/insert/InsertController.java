package com.one.insert;

import com.one.model.jdbcDTO.JdbcDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.one.common.Template.close;
import static com.one.common.Template.getConnection;

public class InsertController {
    public int entrance(JdbcDTO jdbcDTO) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/one/helloworld.xml"));
            String query = prop.getProperty("insertPerson");

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, jdbcDTO.getEntrance_code());
            pstmt.setInt(2, jdbcDTO.getTicket_code());
            pstmt.setString(3, jdbcDTO.getPerson_name());
            pstmt.setInt(4, jdbcDTO.getPerson_age());
            pstmt.setString(5, jdbcDTO.getPerson_gender());
            pstmt.setDouble(6, jdbcDTO.getPerson_height());

            result = pstmt.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
            close(con);
        }

        return result;

    }
}
