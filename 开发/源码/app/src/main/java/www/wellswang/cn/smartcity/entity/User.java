package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class User {
    // 用户ID
    Integer userId;
    // 用户所属部门ID
    Integer deptId;
    // 用户身份 用户和角色之间是多对多
    Integer[] roleIds;
    // 用户名称
    String userName;
    // 用户昵称
    String nickName;
    // 邮箱
    String emial;
    // 电话
    String phonenumber;
    // 身份证
    String idCard;
    // 性别 1为男性 0为女性
    Integer sex;
    // 用户头像图片资源
    String file;
    // avatar
    // 例如：/profile/avatar/2020/09/10/e613163d-26a4-4371-8b63-79aa5937d4fb.jpeg
    String avatar;
    // 是否是管理员
    Boolean admin;
    // 创建用户者
    User createBy;
    // 创建时间
    Date createTime;
    // 最后一次更新用户者
    User updateBy;
    // 最后一次更新时间
    Date updateTime;
    // 最后一次登录的IP
    String loginIp;
    // 最后登录的时间
    Date loginDate;
    // 标记
    String remark;
    // 状态
    Integer status;
    // 是否被删除
    Integer delFlag;
}
