package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class Press {
    // 评论ID
    private Integer pressId;
    // 评论内容
    private String content;
    // 评论用户ID
    private Integer userId;
    // avatar
    private String avatar;
    // 创建评论者
    private User creteBy;
    // 创建时间
    private Date createTime;
    // 更新评论信息者
    private User updateBy;
    // 更新时间
    private Date updateTime;
    // 标志
    private String remark;

    public Integer getPressId() {
        return pressId;
    }

    public void setPressId(Integer pressId) {
        this.pressId = pressId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public User getCreteBy() {
        return creteBy;
    }

    public void setCreteBy(User creteBy) {
        this.creteBy = creteBy;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
