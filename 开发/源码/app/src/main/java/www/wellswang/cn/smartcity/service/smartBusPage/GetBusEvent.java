package www.wellswang.cn.smartcity.service.smartBusPage;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.BusInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.Bus;

public class GetBusEvent {
    public ArrayList<Bus> getAllBus() {
        return new BusInfoDAOImpl().getAllBus();
    }
}
