package www.wellswang.cn.smartcity.dao;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.Service;

public interface ServiceInfoDAO {

    ArrayList<Service> getAllService();

    ArrayList<Service> getRecommendService();
}
