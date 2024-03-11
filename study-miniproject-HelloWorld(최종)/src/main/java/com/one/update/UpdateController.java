package com.one.update;

import com.one.model.jdbcDTO.JdbcDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.one.common.Template.close;
import static com.one.common.Template.getConnection;

public class UpdateController {

    public int updateMenu(JdbcDTO jdbcDTO){

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/one/helloworld.xml"));
            String query = prop.getProperty("updateWaitingTime");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1,jdbcDTO.getWating_time());
            pstmt.setInt(2,jdbcDTO.getRide_code());


            result = pstmt.executeUpdate();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }
        return result;
    }


    public int updateEntranceCode(JdbcDTO jdbcDTO) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/one/helloworld.xml"));
            String query = prop.getProperty("enterRide");

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,jdbcDTO.getEntrance_code());
            pstmt.setString(2,jdbcDTO.getRide_sort());


            result = pstmt.executeUpdate();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }
        return result;
    }
}
