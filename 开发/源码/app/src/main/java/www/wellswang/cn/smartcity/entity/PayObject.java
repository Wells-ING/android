package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class PayObject {
    // 生活缴费类型
    private Integer payObjectId;
    // 用户编号
    private Integer userId;
    // 拥有者名称
    private String ownername;
    // 为谁缴费类型名称：例如："父母"
    private String typename;
    // 缴费类型
    private Integer classifyId;
    // 缴费类型名称：例如："水费"
    private String livename;
    // 门户号
    private String doorNo;
    // 创建生活缴费类型者
    private User creteBy;
    // 创建时间
    private Date createTime;
    // 更新生活缴费类型信息者
    private User updateBy;
    // 更新时间
    private Date updateTime;
    // 标志
    private String remark;

    public Integer getPayObjectId() {
        return payObjectId;
    }

    public void setPayObjectId(Integer payObjectId) {
        this.payObjectId = payObjectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getLivename() {
        return livename;
    }

    public void setLivename(String livename) {
        this.livename = livename;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
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
