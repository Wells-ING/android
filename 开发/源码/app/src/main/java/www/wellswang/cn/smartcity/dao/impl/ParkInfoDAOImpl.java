package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.ParkInfoDAO;
import www.wellswang.cn.smartcity.entity.Park;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class ParkInfoDAOImpl implements ParkInfoDAO {
    @Override
    public ArrayList<Park> getAllPark() {
        String selectSQL = "SELECT * FROM park";
        ArrayList<Park> parks = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                Park currentPark = new Park();
                currentPark.setId(rs.getInt("id"));
                currentPark.setParkName(rs.getString("parkName"));
                currentPark.setAllPark(rs.getInt("allPark"));
                currentPark.setVacancy(rs.getInt("vacancy"));
                currentPark.setPriceCaps(rs.getDouble("priceCaps"));
                currentPark.setImgUrl(rs.getString("imgUrl"));
                currentPark.setRates(rs.getInt("rates"));
                currentPark.setAddress(rs.getString("address"));
                currentPark.setDistance(rs.getInt("distance"));
                currentPark.setCreateBy(new User(rs.getString("createBy")));
                currentPark.setCreateTime(rs.getDate("createTime"));
                currentPark.setUpdateBy(new User(rs.getString("updateBy")));
                currentPark.setUpdateTime(rs.getDate("updateTime"));
                currentPark.setRemark(rs.getString("remark"));
                parks.add(currentPark);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return parks;
    }
}
