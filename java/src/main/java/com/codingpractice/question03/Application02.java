package main.java.com.codingpractice.question03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static main.java.com.codingpractice.question03.common.JDBCTemplate.close;
import static main.java.com.codingpractice.question03.common.JDBCTemplate.getConnection;

public class Application02 {
    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            pstmt = con.prepareStatement("SELECT EMP_ID,EMP_NAME,PHONE,SALARY FROM EMPLOYEE WHERE EMP_ID = ?");
            pstmt.setString(1,"200");
            rset = pstmt.executeQuery();

            while (rset.next()){
                System.out.println(rset.getString(1)+ " " + rset.getString(2)+" "+rset.getString(3)+" "+rset.getInt(4));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(con);
            close(pstmt);
            close(rset);
        }

    }
}
