package www.wellswang.cn.smartcity.test.jdbcTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import www.wellswang.cn.smartcity.utils.DBUtil;

public class JDBCTest {
    public static void main(String[] args) throws Exception {
        String selectSQL = "SELECT * FROM user WHERE userId = 1";
        String userName = "";
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            rs.next();
            userName = rs.getString("userName");
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        System.out.println(userName);
    }
}
