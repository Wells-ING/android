package www.wellswang.cn.smartcity.test.homePageTest.service;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.Service;
import www.wellswang.cn.smartcity.service.homePage.GetServiceEvent;

public class GetAllServiceTest {
    public static void main(String[] args) {
        ArrayList<Service> services = new GetServiceEvent().getAllService();
        for(Service s : services) {
            System.out.println(s.toString());
        }
    }
}
