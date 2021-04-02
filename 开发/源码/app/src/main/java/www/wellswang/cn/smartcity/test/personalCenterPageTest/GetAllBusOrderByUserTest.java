package www.wellswang.cn.smartcity.test.personalCenterPageTest;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.UserInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.BusOrder;
import www.wellswang.cn.smartcity.entity.User;

public class GetAllBusOrderByUserTest {
    public static void main(String[] args) {
        User user = new UserInfoDAOImpl().getUserIdByUsername("admin");
        ArrayList<BusOrder> busOrders = new UserInfoDAOImpl().getAllBusOrderByUser(user);
        for(BusOrder b : busOrders) {
            System.out.println(b);
        }
    }
}
