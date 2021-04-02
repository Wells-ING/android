package www.wellswang.cn.smartcity.dao;

import www.wellswang.cn.smartcity.entity.User;

public interface SuggestionInfoDAO {
    boolean addSuggestion(User user, String content);
}
