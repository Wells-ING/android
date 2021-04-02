package www.wellswang.cn.smartcity.test.personalCenterPageTest.modifyPersonalInfoTest;

import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.service.personalCenterPage.ModifyPersonalInfoEvent;

public class ModifyNicknameTest {
    public static void main(String[] args) {
        User user = new User("admin");
        String newNickname = "宋哥";
        boolean flag = new ModifyPersonalInfoEvent().modifyNickname(user, newNickname);
        if(flag) {
            System.out.println("修改昵称成功");
        } else {
            System.out.println("修改昵称失败");
        }
    }
}
