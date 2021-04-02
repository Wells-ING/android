package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import www.wellswang.cn.smartcity.dao.ParkRecordInfoDAO;
import www.wellswang.cn.smartcity.entity.ParkRecord;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class ParkRecordInfoDAOImpl implements ParkRecordInfoDAO {
    @Override
    public ArrayList<ParkRecord> getAllParkRecordByUser() {
        String selectSQL = "SELECT * FROM park_record";
        ArrayList<ParkRecord> parkRecords = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                ParkRecord currentParkRecord = new ParkRecord();
                currentParkRecord.setId(rs.getInt("id"));
                currentParkRecord.setParkId(rs.getInt("parkId"));
                currentParkRecord.setEntryTime(rs.getDate("entryTime"));
                currentParkRecord.setOutTime(rs.getDate("outTime"));
                currentParkRecord.setPlateNumber(rs.getString("plateNumber"));
                currentParkRecord.setMonetary(rs.getDouble("monetary"));
                currentParkRecord.setCreteBy(new User(rs.getString("createBy")));
                currentParkRecord.setCreateTime(rs.getDate("createTime"));
                currentParkRecord.setUpdateBy(new User(rs.getString("updateBy")));
                currentParkRecord.setUpdateTime(rs.getDate("updateTime"));
                currentParkRecord.setRemark(rs.getString("remark"));
                parkRecords.add(currentParkRecord);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return parkRecords;
    }

    @Override
    public ArrayList<ParkRecord> getParkRecordByDate(Date start, Date end) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startStr = simpleDateFormat.format(start);
        String endStr = simpleDateFormat.format(end);
        String selectSQL = "SELECT * FROM park_record WHERE entryTime >= '" + startStr + "' AND outTime <= '" + endStr + "'";
        ArrayList<ParkRecord> parkRecords = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                ParkRecord currentParkRecord = new ParkRecord();
                currentParkRecord.setId(rs.getInt("id"));
                currentParkRecord.setParkId(rs.getInt("parkId"));
                currentParkRecord.setEntryTime(rs.getDate("entryTime"));
                currentParkRecord.setOutTime(rs.getDate("outTime"));
                currentParkRecord.setPlateNumber(rs.getString("plateNumber"));
                currentParkRecord.setMonetary(rs.getDouble("monetary"));
                currentParkRecord.setCreteBy(new User(rs.getString("createBy")));
                currentParkRecord.setCreateTime(rs.getDate("createTime"));
                currentParkRecord.setUpdateBy(new User(rs.getString("updateBy")));
                currentParkRecord.setUpdateTime(rs.getDate("updateTime"));
                currentParkRecord.setRemark(rs.getString("remark"));
                parkRecords.add(currentParkRecord);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return parkRecords;
    }

}
