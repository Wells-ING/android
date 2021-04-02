package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.BusOrderInfoDAO;
import www.wellswang.cn.smartcity.entity.BusOrder;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class BusOrderInfoDAOImpl implements BusOrderInfoDAO {

    @Override
    public ArrayList<BusOrder> getAllBusOrderByUser(User user) {
        String selectSQL = "SELECT * FROM bus_order WHERE userId = '" + user.getUserId() + "'";
        ArrayList<BusOrder> busOrders = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                BusOrder currentBusOrder = new BusOrder();
                currentBusOrder.setId(rs.getInt("id"));
                currentBusOrder.setUserId(rs.getInt("userId"));
                currentBusOrder.setOrderNum(rs.getString("orderNum"));
                currentBusOrder.setPath(rs.getString("path"));
                currentBusOrder.setStart(rs.getString("start"));
                currentBusOrder.setEnd(rs.getString("end"));
                currentBusOrder.setPrice(rs.getDouble("price"));
                currentBusOrder.setCreateBy(new User(rs.getString("createBy")));
                currentBusOrder.setCreateTime(rs.getDate("createTime"));
                currentBusOrder.setUpdateBy(new User(rs.getString("updateBy")));
                currentBusOrder.setUpdateTime(rs.getDate("updateTime"));
                currentBusOrder.setRemark(rs.getString("remark"));
                currentBusOrder.setStatus(rs.getInt("status"));
                busOrders.add(currentBusOrder);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return busOrders;
    }
}
