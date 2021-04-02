package www.wellswang.cn.smartcity.test.personalCenterPageTest;

import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.service.personalCenterPage.ModifyPasswordEvent;

public class ModifyPasswordTest {
    public static void main(String[] args) {
        User user = new User("admin", "123456");
        String newPassword = "654321";
        boolean flag = new ModifyPasswordEvent().modifyPassword(user, newPassword);
        if(flag) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }
}
