package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.UserInfoDAO;
import www.wellswang.cn.smartcity.entity.BusOrder;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class UserInfoDAOImpl implements UserInfoDAO {
    @Override
    public boolean login(User loginUser) {
        String selectSQL = "SELECT password FROM user WHERE username = '" + loginUser.getUsername() + "'";
        boolean flag = false;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            rs.next();
            String returnPassword = rs.getString("password");
            if(loginUser.getPassword().equals(returnPassword)) {
                flag = true;
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return flag;
    }

    @Override
    public User getAllUserInfo(String username) {
        String selectSQL = "SELECT * FROM user WHERE username = '" + username + "'";
        User returnUser = new User();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            rs.next();
            returnUser.setUserId(rs.getInt("userId"));
            returnUser.setDeptId(rs.getInt("deptId"));
            returnUser.setDeptId(rs.getInt("roleId"));
            returnUser.setUsername(rs.getString("username"));
            returnUser.setNickname(rs.getString("nickname"));
            returnUser.setPassword(rs.getString("password"));
            returnUser.setEmial(rs.getString("email"));
            returnUser.setPhonenumber(rs.getString("phonenumber"));
            returnUser.setIdCard(rs.getString("idCard"));
            returnUser.setSex(rs.getInt("sex"));
            returnUser.setFile(rs.getString("file"));
            returnUser.setAvatar(rs.getString("avatar"));
            if(rs.getInt("admin") == 1) {
                returnUser.setAdmin(true);
            } else {
                returnUser.setAdmin(false);
            }
            returnUser.setCreateBy(new User(rs.getString("createBy")));
            returnUser.setCreateTime(rs.getDate("createTime"));
            returnUser.setUpdateBy(new User(rs.getString("updateBy")));
            returnUser.setUpdateTime(rs.getDate("updateTime"));
            returnUser.setLoginIp(rs.getString("loginIp"));
            returnUser.setLoginDate(rs.getDate("loginDate"));
            returnUser.setRemark(rs.getString("remark"));
            returnUser.setStatus(rs.getInt("status"));
            returnUser.setDelFlag(rs.getInt("delFlag"));
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return returnUser;
    }

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

    @Override
    public User getUserIdByUsername(String username) {
        String selectSQL = "SELECT * FROM user WHERE username = '" + username + "'";
        User returnUser = new User();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            rs.next();
            returnUser.setUserId(rs.getInt("userId"));
            returnUser.setUsername(rs.getString("username"));

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return returnUser;
    }

    @Override
    public boolean modifyPassword(User user, String newPassword) {
        String selectSQL = "SELECT password FROM user WHERE username = '" + user.getUsername() + "'";
        boolean passwordFlag = false;
        boolean modifyFlag = false;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            rs.next();
            String returnPassword = rs.getString("password");
            if(user.getPassword().equals(returnPassword)) {
                passwordFlag = true;
            }
            if(passwordFlag) {
                String updateSQL = "UPDATE user SET "
                        + "password = '" + newPassword + "'"
                        + " WHERE username = '" + user.getUsername() + "'";
                int count = stm.executeUpdate(updateSQL);
                if(count > 0) {
                    modifyFlag = true;
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return modifyFlag;
    }

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

    @Override
    public boolean modifyFile(User user, String newFile) {
        String updateSQL = "UPDATE user SET "
                + "file = '" + newFile + "'"
                + " WHERE username = '" + user.getUsername() + "'";
        boolean flag = false;
        Connection conn = null;
        Statement stm = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            int count = stm.executeUpdate(updateSQL);
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

    @Override
    public boolean modifyNickname(User user, String newNickname) {
        String updateSQL = "UPDATE user SET "
                + "nickname = '" + newNickname + "'"
                + " WHERE username = '" + user.getUsername() + "'";
        boolean flag = false;
        Connection conn = null;
        Statement stm = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            int count = stm.executeUpdate(updateSQL);
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

    @Override
    public boolean modifySex(User user, Integer newSex) {
        String updateSQL = "UPDATE user SET "
                + "sex = " + newSex
                + " WHERE username = '" + user.getUsername() + "'";
        boolean flag = false;
        Connection conn = null;
        Statement stm = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            int count = stm.executeUpdate(updateSQL);
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

    @Override
    public boolean modifyPhonenumber(User user, String newPhonenumber) {
        String updateSQL = "UPDATE user SET "
                + "phonenumber = '" + newPhonenumber + "'"
                + " WHERE username = '" + user.getUsername() + "'";
        boolean flag = false;
        Connection conn = null;
        Statement stm = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            int count = stm.executeUpdate(updateSQL);
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
