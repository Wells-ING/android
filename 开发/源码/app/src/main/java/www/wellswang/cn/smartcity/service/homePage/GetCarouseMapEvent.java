package www.wellswang.cn.smartcity.service.homePage;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.CarouselMapInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.CarouselMap;

public class GetCarouseMapEvent {
    public ArrayList<CarouselMap> getAllCarouseMap() {
        return new CarouselMapInfoDAOImpl().getAllCarouseMap();
    }
}
