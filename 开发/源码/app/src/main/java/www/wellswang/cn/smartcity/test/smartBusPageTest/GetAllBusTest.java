package www.wellswang.cn.smartcity.test.smartBusPageTest;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.Bus;
import www.wellswang.cn.smartcity.service.smartBusPage.GetBusEvent;

public class GetAllBusTest {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new GetBusEvent().getAllBus();
        for(Bus b : buses) {
            System.out.println(b.toString());
        }
    }
}
