package www.wellswang.cn.smartcity.test.personalCenterPageTest;

import www.wellswang.cn.smartcity.dao.impl.UserInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.service.personalCenterPage.SuggestionEvent;

public class AddSuggestionTest {
    public static void main(String[] args) {
        User user = new UserInfoDAOImpl().getUserIdByUsername("admin");
        String content = "内容不够丰富，太少了";
        boolean flag = new SuggestionEvent().addSuggestion(user, content);
        if(flag) {
            System.out.println("建议插入成功");
        } else {
            System.out.println("建议插入失败");
        }
    }
}
