package www.wellswang.cn.smartcity.test.homePageTest.firstService;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.FirstService;
import www.wellswang.cn.smartcity.service.homePage.GetFirstServiceEvent;

public class GetAllPressFirstServiceTest {
    public static void main(String[] args) {
        ArrayList<FirstService> firstServices = new GetFirstServiceEvent().getAllPressFirstService();
        for(FirstService f : firstServices) {
            System.out.println(f.toString());
        }
    }
}
