package www.wellswang.cn.smartcity.test.personalCenterPageTest.modifyPersonalInfoTest;

import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.service.personalCenterPage.ModifyPersonalInfoEvent;

public class ModifySexTest {
    public static void main(String[] args) {
        User user = new User("admin");
        Integer newSex = 0;
        boolean flag = new ModifyPersonalInfoEvent().modifySex(user, newSex);
        if(flag) {
            System.out.println("修改性别成功");
        } else {
            System.out.println("修改性别失败");
        }
    }
}
