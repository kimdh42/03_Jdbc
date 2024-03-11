package com.ohgiraffers.section03.sqlinjection;

import java.sql.*;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application3 {

    private static String empId = "210";
    private static String empName = "' OR 1=1 AND EMP_ID = '200";

    public static void main(String[] args) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ? AND EMP_NAME = ?";
        System.out.println(query);

        /* 아래 sql과 같이 PreparedStatement로 입력되는 값에 single quotation(')이 있다면
        *  single quotation을 하나 더 붙여주고, setString으로 값이 들어갈 때 양 옆에도
        *  single quotation을 붙여준다. */
//        SELECT * FROM EMPLOYEE WHERE EMP_ID = 210 AND EMP_NAME = ' OR 1=1 AND EMP_ID = '200
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empId);
            pstmt.setString(2, empName);

            rset = pstmt.executeQuery();

            if(rset.next()){
                System.out.println(rset.getString("EMP_NAME") + "님 환영홥니다.");
            } else {
                System.out.println("회원 정보가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }
    }
}
