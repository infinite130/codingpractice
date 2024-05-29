package main.java.com.codingpractice.question03;

import main.java.com.codingpractice.question03.dto.SalaryDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static main.java.com.codingpractice.question03.common.JDBCTemplate.close;
import static main.java.com.codingpractice.question03.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        // 여러 DTO를 List로 묶어서 조회

        Connection con = getConnection();

        Statement stmt = null;

        ResultSet rset = null;

        // 한 행의 정보를 담을 DTO
        SalaryDTO row = null;

        // 여러 DTO를 묶을 LIST
        List<SalaryDTO> emplist = null;

        String query = "SELECT * FROM EMPLOYEE";

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);
            emplist = new ArrayList<>();

            while (rset.next()) {
                row = new SalaryDTO();

                row.setEmpID(rset.getString("EMP_ID"));
                row.setEmpName(rset.getString("EMP_NAME"));
                row.setPhone(rset.getString("PHONE"));
                row.setSalary(rset.getInt("SALARY"));

                emplist.add(row);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(con);
            close(stmt);
            close(rset);
        }


        for(SalaryDTO emp : emplist){

            System.out.println(emp);
        }



    }
}
