package www.wellswang.cn.smartcity.test.homePageTest.firstService;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.FirstService;
import www.wellswang.cn.smartcity.service.homePage.GetFirstServiceEvent;

public class GetAllSysFirstServiceTest {
    public static void main(String[] args) {
        ArrayList<FirstService> firstServices = new GetFirstServiceEvent().getAllSysFirstService();
        for(FirstService f : firstServices) {
            System.out.println(f.toString());
        }
    }
}
