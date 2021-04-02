package www.wellswang.cn.smartcity.service.personalCenterPage;


import www.wellswang.cn.smartcity.dao.impl.UserInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.User;

/**
 * 登录事件
 */

public class LoginEvent {
    // 普通登录
    public boolean login(User loginUser) {
        return new UserInfoDAOImpl().login(loginUser);
    }

}
