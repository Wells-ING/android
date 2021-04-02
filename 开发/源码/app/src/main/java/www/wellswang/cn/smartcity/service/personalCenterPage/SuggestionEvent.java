package www.wellswang.cn.smartcity.service.personalCenterPage;

import www.wellswang.cn.smartcity.dao.impl.UserInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.User;

public class SuggestionEvent {
    public boolean addSuggestion(User user, String content) {
        return new UserInfoDAOImpl().addSuggestion(user, content);
    }
}
