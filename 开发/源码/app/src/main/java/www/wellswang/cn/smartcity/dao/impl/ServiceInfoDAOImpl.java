package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.ServiceInfoDAO;
import www.wellswang.cn.smartcity.entity.Service;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class ServiceInfoDAOImpl implements ServiceInfoDAO {
    @Override
    public ArrayList<Service> getAllService() {
        String selectSQL = "SELECT * FROM service";
        ArrayList<Service> services = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                Service currentService = new Service();
                currentService.setId(rs.getInt("id"));
                currentService.setServiceName(rs.getString("serviceName"));
                currentService.setServiceDesc(rs.getString("serviceDesc"));
                currentService.setServiceType(rs.getInt("serviceType"));
                currentService.setImgUrl(rs.getString("imgUrl"));
                if(rs.getInt("isRecommend") == 1) {
                    currentService.setRecommend(true);
                } else {
                    currentService.setRecommend(false);
                }
                currentService.setLink(rs.getString("link"));
                currentService.setCreateBy(new User(rs.getString("createBy")));
                currentService.setCreateTime(rs.getDate("createTime"));
                currentService.setUpdateBy(new User(rs.getString("updateBy")));
                currentService.setUpdateTime(rs.getDate("updateTime"));
                currentService.setPid(rs.getInt("pid"));
                services.add(currentService);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return services;
    }

    @Override
    public ArrayList<Service> getRecommendService() {
        String selectSQL = "SELECT * FROM service WHERE isRecommend = " + 1;
        ArrayList<Service> services = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                Service currentService = new Service();
                currentService.setId(rs.getInt("id"));
                currentService.setServiceName(rs.getString("serviceName"));
                currentService.setServiceDesc(rs.getString("serviceDesc"));
                currentService.setServiceType(rs.getInt("serviceType"));
                currentService.setImgUrl(rs.getString("imgUrl"));
                if(rs.getInt("isRecommend") == 1) {
                    currentService.setRecommend(true);
                } else {
                    currentService.setRecommend(false);
                }
                currentService.setLink(rs.getString("link"));
                currentService.setCreateBy(new User(rs.getString("createBy")));
                currentService.setCreateTime(rs.getDate("createTime"));
                currentService.setUpdateBy(new User(rs.getString("updateBy")));
                currentService.setUpdateTime(rs.getDate("updateTime"));
                currentService.setPid(rs.getInt("pid"));
                services.add(currentService);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return services;
    }
}
