package www.wellswang.cn.smartcity.dao;

import java.util.ArrayList;
import java.util.Date;

import www.wellswang.cn.smartcity.entity.ParkRecord;

public interface ParkRecordInfoDAO {
    ArrayList<ParkRecord> getAllParkRecordByUser();

    ArrayList<ParkRecord> getParkRecordByDate(Date start, Date end);
}
