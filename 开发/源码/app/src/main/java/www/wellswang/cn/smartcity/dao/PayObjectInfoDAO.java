package www.wellswang.cn.smartcity.dao;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.PayObject;
import www.wellswang.cn.smartcity.entity.User;

public interface PayObjectInfoDAO {

    // 添加分组
    boolean addPayObject(Integer obld, User user, Integer doorId, Integer classifyId);

    // 查询分组
    ArrayList<PayObject> getAllPayObjects();

}
