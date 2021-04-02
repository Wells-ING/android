package www.wellswang.cn.smartcity.test.homePageTest;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.CarouselMap;
import www.wellswang.cn.smartcity.service.homePage.GetCarouseMapEvent;

public class GetAllCarouselMapInfoTest {
    public static void main(String[] args) {
        ArrayList<CarouselMap> carouselMaps = new GetCarouseMapEvent().getAllCarouseMap();
        for(CarouselMap c : carouselMaps) {
            System.out.println(c.toString());
        }
    }
}
