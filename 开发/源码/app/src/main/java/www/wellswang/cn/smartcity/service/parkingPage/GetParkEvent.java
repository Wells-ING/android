package www.wellswang.cn.smartcity.service.parkingPage;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.ParkInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.Park;

public class GetParkEvent {
    public ArrayList<Park> getAllPark() {
        return new ParkInfoDAOImpl().getAllPark();
    }
}
