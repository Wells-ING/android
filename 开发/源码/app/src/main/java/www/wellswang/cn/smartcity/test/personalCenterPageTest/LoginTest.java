package www.wellswang.cn.smartcity.test.personalCenterPageTest;

import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.service.personalCenterPage.LoginEvent;

public class LoginTest {

    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        User loginUser = new User(username, password);
        if(new LoginEvent().login(loginUser)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
