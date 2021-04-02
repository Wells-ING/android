package www.wellswang.cn.smartcity.service.personalCenterPage;

import www.wellswang.cn.smartcity.dao.impl.UserInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.User;

public class ModifyPasswordEvent {
    public boolean modifyPassword(User user, String newPassword) {
        return new UserInfoDAOImpl().modifyPassword(user, newPassword);
    }
}
