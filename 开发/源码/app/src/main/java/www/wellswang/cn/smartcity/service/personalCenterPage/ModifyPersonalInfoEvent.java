package www.wellswang.cn.smartcity.service.personalCenterPage;

import www.wellswang.cn.smartcity.dao.impl.UserInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.User;

public class ModifyPersonalInfoEvent {
    public boolean modifyFile(User user, String newFile) {
        return new UserInfoDAOImpl().modifyFile(user, newFile);
    }

    public boolean modifyNickname(User user, String newNickname) {
        return new UserInfoDAOImpl().modifyNickname(user, newNickname);
    }

    public boolean modifySex(User user, Integer newSex) {
        return new UserInfoDAOImpl().modifySex(user, newSex);
    }

    public boolean modifyPhonenumber(User user, String newPhonenumber) {
        return new UserInfoDAOImpl().modifyPhonenumber(user, newPhonenumber);
    }
}
