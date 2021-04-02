package www.wellswang.cn.smartcity.service.lifeChargePage;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.PayObjectInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.PayObject;

public class GetAllPayObject {
    public ArrayList<PayObject> getAllPayObjects() {
        return new PayObjectInfoDAOImpl().getAllPayObjects();
    }
}
