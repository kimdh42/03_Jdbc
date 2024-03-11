package com.one.run;

import com.one.insert.Insert;
import com.one.delete.Delete;
import com.one.model.jdbcDTO.JdbcDTO;
import com.one.update.Update;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.one.common.Template.close;
import static com.one.common.Template.getConnection;

public class JdbcApplication {
    public static void main(String[] args) {

        Delete delete = new Delete();
        Insert insert = new Insert();
        Update update = new Update();
        JdbcDTO jdbcDTO = new JdbcDTO();

        Scanner sc = new Scanner(System.in);
        label:
        do {
            System.out.println("********** 메뉴 **********");
            System.out.println("1. 손님 입장");         //insert
            System.out.println("2. 입장인원 전체 조회");
            System.out.println("3. 줄서기");            //update
            System.out.println("4. 대기시간 변경");      //update
            System.out.println("5. 집가기");            //delete
            System.out.println("6. 놀이공원 폐장");
            System.out.print("번호를 입력 하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    insert.insertMenu();
                    break;
                case 2:
                    searchAllPerson();
                    break;
                case 3:
                    update.enterRide();
                    break;
                case 4:
                    update.updateWatingTime();
                    break;
                case 5:
                    delete.goHomePesson();
                    break;
                case 6:
                    System.out.println("이제는 우리가 헤어져야 할시간~");
                    break label;

            }
        } while (true);
    }

    private static void searchAllPerson() {


        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/one/helloworld.xml"));
            String query = prop.getProperty("searchAllPerson");

            pstmt = con.prepareStatement(query);
//            System.out.println(query);
            resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                int entranceCode = resultSet.getInt("ENTRANCE_CODE");
                int ticketCode = resultSet.getInt("TICKET_CODE");
                String personName = resultSet.getString("PERSON_NAME");
                int personAge = resultSet.getInt("PERSON_AGE");
                String personGender = resultSet.getString("PERSON_GENDER");
                double personHeight = resultSet.getDouble("PERSON_HEIGHT");

                System.out.println("입장번호: " + entranceCode + " 티켓번호: " + ticketCode + " 고객이름: " + personName
                                    + " 고객나이: " + personAge + " 고객성별: " + personGender + " 고객키: " + personHeight);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(resultSet);
            close(pstmt);
            close(con);
        }

    }
}
