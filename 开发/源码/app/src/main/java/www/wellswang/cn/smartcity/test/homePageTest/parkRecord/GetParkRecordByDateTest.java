package www.wellswang.cn.smartcity.test.homePageTest.parkRecord;

import java.util.ArrayList;
import java.util.Date;

import www.wellswang.cn.smartcity.entity.ParkRecord;
import www.wellswang.cn.smartcity.service.parkingPage.GetParkRecordEvent;

public class GetParkRecordByDateTest {
    public static void main(String[] args) {
        Integer startYear = 2020;
        Integer endYear = 2020;
        Integer startMonth = 10;
        Integer endMonth = 10;
        Integer startDate = 27;
        Integer endDate = 28;
        Integer startHours = 0;
        Integer endHours = 0;
        Integer startMinutes = 0;
        Integer endMinutes = 0;
        Integer startSecond = 0;
        Integer endSecond = 0;
        Date start = new Date(startYear - 1900, startMonth - 1, startDate, startHours, startMinutes, startSecond);
        Date end = new Date(endYear - 1900, endMonth - 1, endDate, endHours, endMinutes, endSecond);
        Date now = new Date();
        ArrayList<ParkRecord> parkRecords = new GetParkRecordEvent().getParkRecordByDate(start, end);
        for(ParkRecord p : parkRecords) {
            System.out.println(p.toString());
        }
    }
}
