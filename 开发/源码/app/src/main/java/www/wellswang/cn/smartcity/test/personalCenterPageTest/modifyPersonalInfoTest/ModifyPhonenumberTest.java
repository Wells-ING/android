package www.wellswang.cn.smartcity.test.personalCenterPageTest.modifyPersonalInfoTest;

import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.service.personalCenterPage.ModifyPersonalInfoEvent;

public class ModifyPhonenumberTest {
    public static void main(String[] args) {
        User user = new User("admin");
        String newPhoneNumber = "1588888888";
        boolean flag = new ModifyPersonalInfoEvent().modifyPhonenumber(user, newPhoneNumber);
        if(flag) {
            System.out.println("联系电话修改成功");
        } else {
            System.out.println("联系电话修改失败");
        }
    }
}
