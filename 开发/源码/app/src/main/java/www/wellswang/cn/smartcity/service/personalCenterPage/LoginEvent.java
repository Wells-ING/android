package www.wellswang.cn.smartcity.service.personalCenterPage;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.UserInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.BusOrder;
import www.wellswang.cn.smartcity.entity.User;

/**
 * 登录事件
 */

public class LoginEvent {
    // 普通登录
    public boolean login(User loginUser) {
        return new UserInfoDAOImpl().login(loginUser);
    }

    // 登录成功后获取所有用户信息
    public User getAllUserInfo(String username) {
        return new UserInfoDAOImpl().getAllUserInfo(username);
    }

    // 获取指定用户所有订单
    public ArrayList<BusOrder> getAllBusOrderByUser(User user) {
        return new UserInfoDAOImpl().getAllBusOrderByUser(user);
    }

}
