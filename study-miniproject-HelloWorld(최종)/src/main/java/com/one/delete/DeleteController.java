package com.one.delete;

import com.one.model.jdbcDTO.JdbcDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.one.common.Template.close;
import static com.one.common.Template.getConnection;

public class DeleteController {

    public int goHome(JdbcDTO jdbcDTO){

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;


        Properties prop = new Properties();
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/one/helloworld.xml"));
            String query = prop.getProperty("goHomePerson");

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,jdbcDTO.getEntrance_code());

            result = pstmt.executeUpdate();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(pstmt);
            close(con);
        }
        return result;
    }
}
