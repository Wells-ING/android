package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class News {
    // 新闻id
    private Integer id;
    // 推送新闻用户ID
    private Integer userId;
    // 推送类别：例如：视频，新闻
    private String pressCategory;
    // 新闻标题
    private String title;
    // 新闻内容
    private String content;
    // 新闻图片
    private String imgUrl;
    // 是否推荐
    private Boolean isRecommend;
    // 喜欢人数
    private Integer likeNumber;
    // 观看人数
    private Integer viewsNumber;
    // 创建新闻者
    private User creteBy;
    // 创建时间
    private Date createTime;
    // 更新新闻者
    private User updateBy;
    // 更新时间
    private Date updateTime;
    // 标志
    private String remark;
    // 推送状态
    private Integer pressStatus;
    // 删除状态
    private Integer delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPressCategory() {
        return pressCategory;
    }

    public void setPressCategory(String pressCategory) {
        this.pressCategory = pressCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Boolean getRecommend() {
        return isRecommend;
    }

    public void setRecommend(Boolean recommend) {
        isRecommend = recommend;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public Integer getViewsNumber() {
        return viewsNumber;
    }

    public void setViewsNumber(Integer viewsNumber) {
        this.viewsNumber = viewsNumber;
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

    public Integer getPressStatus() {
        return pressStatus;
    }

    public void setPressStatus(Integer pressStatus) {
        this.pressStatus = pressStatus;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}
