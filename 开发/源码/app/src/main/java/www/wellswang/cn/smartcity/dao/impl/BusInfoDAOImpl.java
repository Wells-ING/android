package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.BusInfoDAO;
import www.wellswang.cn.smartcity.entity.Bus;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class BusInfoDAOImpl implements BusInfoDAO {
    @Override
    public ArrayList<Bus> getAllBus() {
        String selectSQL = "SELECT * FROM bus";
        ArrayList<Bus> buses = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                Bus currentBus = new Bus();
                currentBus.setId(rs.getInt("id"));
                currentBus.setName(rs.getString("name"));
                currentBus.setStart(rs.getString("start"));
                currentBus.setEnd(rs.getString("end"));
                currentBus.setStartTime(rs.getString("startTime"));
                currentBus.setEndTime(rs.getString("endTime"));
                currentBus.setPrice(rs.getDouble("price"));
                currentBus.setMileage(rs.getInt("mileage"));
                currentBus.setCreateBy(new User(rs.getString("createBy")));
                currentBus.setCreateTime(rs.getDate("createTime"));
                currentBus.setUpdateBy(new User(rs.getString("updateBy")));
                currentBus.setUpdateTime(rs.getDate("updateTime"));
                currentBus.setRemark(rs.getString("remark"));
                buses.add(currentBus);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return buses;
    }
}
