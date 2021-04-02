package www.wellswang.cn.smartcity.test.personalCenterPageTest.modifyPersonalInfoTest;

import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.service.personalCenterPage.ModifyPersonalInfoEvent;

public class ModifyFileTest {
    public static void main(String[] args) {
        User user = new User("admin");
        String newFile = "/something/something/header.jpeg";
        boolean flag = new ModifyPersonalInfoEvent().modifyFile(user, newFile);
        if(flag) {
            System.out.println("修改头像成功");
        } else {
            System.out.println("修改头像失败");
        }
    }
}
