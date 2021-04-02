package www.wellswang.cn.smartcity.service.smartBusPage;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.BusOrderInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.BusOrder;
import www.wellswang.cn.smartcity.entity.User;

public class GetBusOrderEvent {
    // 获取指定用户所有订单
    public ArrayList<BusOrder> getAllBusOrderByUser(User user) {
        return new BusOrderInfoDAOImpl().getAllBusOrderByUser(user);
    }
}
