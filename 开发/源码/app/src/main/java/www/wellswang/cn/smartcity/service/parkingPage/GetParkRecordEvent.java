package www.wellswang.cn.smartcity.service.parkingPage;

import java.util.ArrayList;
import java.util.Date;

import www.wellswang.cn.smartcity.dao.impl.ParkRecordInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.ParkRecord;

public class GetParkRecordEvent {
    public ArrayList<ParkRecord> getAllParkRecord() {
        return new ParkRecordInfoDAOImpl().getAllParkRecordByUser();
    }
    public ArrayList<ParkRecord> getParkRecordByDate(Date start, Date end) {
        return new ParkRecordInfoDAOImpl().getParkRecordByDate(start, end);
    }
}
