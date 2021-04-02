package www.wellswang.cn.smartcity.service.homePage;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.FirstServiceInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.FirstService;

public class GetFirstServiceEvent {
    public ArrayList<FirstService> getAllSysFirstService() {
        return new FirstServiceInfoDAOImpl().getAllSysFirstService();
    }
    public ArrayList<FirstService> getAllPressFirstService() {
        return new FirstServiceInfoDAOImpl().getAllPressFirstService();
    }
}
