package www.wellswang.cn.smartcity.dao;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.BusOrder;
import www.wellswang.cn.smartcity.entity.User;

public interface BusOrderInfoDAO {
    ArrayList<BusOrder> getAllBusOrderByUser(User user);
}
