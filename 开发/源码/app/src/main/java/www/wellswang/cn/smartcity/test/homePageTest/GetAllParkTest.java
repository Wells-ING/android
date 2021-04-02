package www.wellswang.cn.smartcity.test.homePageTest;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.Park;
import www.wellswang.cn.smartcity.service.parkingPage.GetParkEvent;

public class GetAllParkTest {
    public static void main(String[] args) {
        ArrayList<Park> parks = new GetParkEvent().getAllPark();
        for(Park p : parks) {
            System.out.println(p.toString());
        }
    }
}
