package www.wellswang.cn.smartcity.test.personalCenterPageTest;

import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.service.personalCenterPage.LoginEvent;

public class GetAllUserInfoTest {
    public static void main(String[] args) {
        String username = "admin";
        User user = new LoginEvent().getUserAllInfo(username);
        System.out.println(user.toString());
    }
}
