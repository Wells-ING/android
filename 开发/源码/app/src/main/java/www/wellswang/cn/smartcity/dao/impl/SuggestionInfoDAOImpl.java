package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.Statement;

import www.wellswang.cn.smartcity.dao.SuggestionInfoDAO;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class SuggestionInfoDAOImpl implements SuggestionInfoDAO {
    @Override
    public boolean addSuggestion(User user, String content) {
        String insertSQL = "INSERT INTO suggestion(userId, content) "
                + "VALUES("
                +  user.getUserId() + ", '"
                +  content + "'"
                + ")";
        boolean flag = false;
        Connection conn = null;
        Statement stm = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            int count = stm.executeUpdate(insertSQL);
            if(count > 0) {
                flag = true;
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm);
        }
        return flag;
    }
}
