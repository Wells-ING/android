package www.wellswang.cn.smartcity.dao;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.BusOrder;
import www.wellswang.cn.smartcity.entity.User;

public interface UserInfoDAO {

    boolean login(User loginUser);

    User getAllUserInfo(String username);

    ArrayList<BusOrder> getAllBusOrderByUser(User user);

    User getUserIdByUsername(String username);

    boolean modifyPassword(User user, String newPassword);

    boolean addSuggestion(User user, String content);

    boolean modifyFile(User user, String newFile);

    boolean modifyNickname(User user, String newNickname);

    boolean modifySex(User user, Integer newSex);

    boolean modifyPhonenumber(User user, String newPhoneNumber);
}
