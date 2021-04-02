package www.wellswang.cn.smartcity.service.lifeChargePage;

import www.wellswang.cn.smartcity.dao.impl.PayObjectInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.User;

public class AddPayObject {


    public boolean addPayObject(Integer obld, User user, Integer doorId, Integer classifyId) {
        return new PayObjectInfoDAOImpl().addPayObject(obld, user, doorId, classifyId);
    }

}
