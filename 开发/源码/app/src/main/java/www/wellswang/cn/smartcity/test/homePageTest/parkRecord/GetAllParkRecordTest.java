package www.wellswang.cn.smartcity.test.homePageTest.parkRecord;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.ParkRecord;
import www.wellswang.cn.smartcity.service.parkingPage.GetParkRecordEvent;

public class GetAllParkRecordTest {
    public static void main(String[] args) {
        ArrayList<ParkRecord> parkRecords = new GetParkRecordEvent().getAllParkRecord();
        for(ParkRecord p : parkRecords) {
            System.out.println(p.toString());
        }
    }
}
