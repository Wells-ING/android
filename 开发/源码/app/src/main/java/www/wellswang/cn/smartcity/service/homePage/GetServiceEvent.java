package www.wellswang.cn.smartcity.service.homePage;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.ServiceInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.Service;

public class GetServiceEvent {
    public ArrayList<Service> getAllService() {
        return new ServiceInfoDAOImpl().getAllService();
    }

    public ArrayList<Service> getRecommendService() {
        return new ServiceInfoDAOImpl().getRecommendService();
    }
}
