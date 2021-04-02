package www.wellswang.cn.smartcity.entity;

import androidx.annotation.NonNull;

import java.util.Date;

public class User {
    // 用户ID
    private Integer userId;
    // 用户所属部门ID
    private Integer deptId;
    // 用户身份
    private Integer roleId;
    // 用户名称
    private String username;
    // 用户昵称
    private String nickname;
    // 密码
    private String password;
    // 邮箱
    private String emial;
    // 电话
    private String phonenumber;
    // 身份证
    private String idCard;
    // 性别 1为男性 0为女性
    private Integer sex;
    // 用户头像图片资源
    private String file;
    // avatar
    // 例如：/profile/avatar/2020/09/10/e613163d-26a4-4371-8b63-79aa5937d4fb.jpeg
    private String avatar;
    // 是否是管理员
    private Boolean admin;
    // 创建用户者
    private User createBy;
    // 创建时间
    private Date createTime;
    // 最后一次更新用户者
    private User updateBy;
    // 最后一次更新时间
    private Date updateTime;
    // 最后一次登录的IP
    private String loginIp;
    // 最后登录的时间
    private Date loginDate;
    // 标记
    private String remark;
    // 状态
    private Integer status;
    // 是否被删除
    private Integer delFlag;

    public User() {

    }

    public User(String username) {
        this.username = username;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(User updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", deptId=" + deptId +
                ", roleId=" + roleId +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", emial='" + emial + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", idCard='" + idCard + '\'' +
                ", sex=" + sex +
                ", file='" + file + '\'' +
                ", avatar='" + avatar + '\'' +
                ", admin=" + admin +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", updateBy=" + updateBy +
                ", updateTime=" + updateTime +
                ", loginIp='" + loginIp + '\'' +
                ", loginDate=" + loginDate +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                ", delFlag=" + delFlag +
                '}';
    }
}
