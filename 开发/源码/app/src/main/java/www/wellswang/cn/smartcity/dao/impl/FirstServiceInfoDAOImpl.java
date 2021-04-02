package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.FirstServiceInfoDAO;
import www.wellswang.cn.smartcity.entity.FirstService;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class FirstServiceInfoDAOImpl implements FirstServiceInfoDAO {
    @Override
    public ArrayList<FirstService> getAllSysFirstService() {
        String selectSQL = "SELECT * FROM first_service WHERE dictType = 'sys_service'";
        ArrayList<FirstService> firstServices = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                FirstService currentFirstService = new FirstService();
                currentFirstService.setDictCode(rs.getInt("dictCode"));
                currentFirstService.setDictLabel(rs.getString("dictLabel"));
                currentFirstService.setDictValue(rs.getInt("dictValue"));
                currentFirstService.setDictType(rs.getString("dictType"));
                currentFirstService.setDictSort(rs.getInt(("dictSort")));
                currentFirstService.setCssClass(rs.getInt("cssClass"));
                currentFirstService.setListClass(rs.getInt("listClass"));
                currentFirstService.setIsDefault(rs.getString("isDefault"));
                if(rs.getInt("default") == 1) {
                    currentFirstService.setDefault(true);
                } else {
                    currentFirstService.setDefault(false);
                }
                currentFirstService.setCreateBy(new User(rs.getString(("createBy"))));
                currentFirstService.setCreateTime(rs.getDate("createTime"));
                currentFirstService.setUpdateBy(new User(rs.getString(("updateBy"))));
                currentFirstService.setUpdateTime(rs.getDate("updateTime"));
                currentFirstService.setRemark(rs.getString("remark"));
                currentFirstService.setStatus(rs.getInt("status"));
                firstServices.add(currentFirstService);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return firstServices;
    }

    @Override
    public ArrayList<FirstService> getAllPressFirstService() {
        String selectSQL = "SELECT * FROM first_service WHERE dictType = 'press_category'";
        ArrayList<FirstService> firstServices = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                FirstService currentFirstService = new FirstService();
                currentFirstService.setDictCode(rs.getInt("dictCode"));
                currentFirstService.setDictLabel(rs.getString("dictLabel"));
                currentFirstService.setDictValue(rs.getInt("dictValue"));
                currentFirstService.setDictType(rs.getString("dictType"));
                currentFirstService.setDictSort(rs.getInt(("dictSort")));
                currentFirstService.setCssClass(rs.getInt("cssClass"));
                currentFirstService.setListClass(rs.getInt("listClass"));
                currentFirstService.setIsDefault(rs.getString("isDefault"));
                if(rs.getInt("default") == 1) {
                    currentFirstService.setDefault(true);
                } else {
                    currentFirstService.setDefault(false);
                }
                currentFirstService.setCreateBy(new User(rs.getString(("createBy"))));
                currentFirstService.setCreateTime(rs.getDate("createTime"));
                currentFirstService.setUpdateBy(new User(rs.getString(("updateBy"))));
                currentFirstService.setUpdateTime(rs.getDate("updateTime"));
                currentFirstService.setRemark(rs.getString("remark"));
                currentFirstService.setStatus(rs.getInt("status"));
                firstServices.add(currentFirstService);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return firstServices;
    }
}
