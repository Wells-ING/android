package www.wellswang.cn.smartcity.service.personalCenterPage;

import www.wellswang.cn.smartcity.dao.impl.UserInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.User;

public class GetUserAllInfo {
    // 登录成功后获取所有用户信息
    public User getUserAllInfo(String username) {
        return new UserInfoDAOImpl().getAllUserInfo(username);
    }
}
