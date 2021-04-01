package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class Charge {
    // 缴费ID
    private Integer electricityId;
    // 用户ID
    private Integer userId;
    // 户号ID
    private Integer doorId;
    // 门户号
    private String doorNo;
    // 标题
    private String title;
    // 费用
    private Double electricityMoney;
    // 收费单位
    private String chargeUnit;
    // 拥有者名称
    private String ownerName;
    // 缴费类别名称
    private String liveName;
    // balance
    Boolean balance;
    // 创建收费详情者
    private User creteBy;
    // 创建时间
    private Date createTime;
    // 更新收费详情信息者
    private User updateBy;
    // 更新时间
    private Date updateTime;
    // 标志
    private String remark;

    public Integer getElectricityId() {
        return electricityId;
    }

    public void setElectricityId(Integer electricityId) {
        this.electricityId = electricityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDoorId() {
        return doorId;
    }

    public void setDoorId(Integer doorId) {
        this.doorId = doorId;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getElectricityMoney() {
        return electricityMoney;
    }

    public void setElectricityMoney(Double electricityMoney) {
        this.electricityMoney = electricityMoney;
    }

    public String getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLiveName() {
        return liveName;
    }

    public void setLiveName(String liveName) {
        this.liveName = liveName;
    }

    public Boolean getBalance() {
        return balance;
    }

    public void setBalance(Boolean balance) {
        this.balance = balance;
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
