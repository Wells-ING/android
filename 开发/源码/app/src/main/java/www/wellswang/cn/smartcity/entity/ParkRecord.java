package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class ParkRecord {
    // 停车记录ID
    private Integer id;
    // 停车场ID
    private Integer parkId;
    // 进场时间
    private Date entryTime;
    // 出场时间
    private Date outTime;
    // 车牌号
    private String plateNumber;
    // 停车费
    private Double monetary;
    // 创建停车记录者
    private User creteBy;
    // 创建时间
    private Date createTime;
    // 更新停车记录信息者
    private User updateBy;
    // 更新时间
    private Date updateTime;
    // 标志
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Double getMonetary() {
        return monetary;
    }

    public void setMonetary(Double monetary) {
        this.monetary = monetary;
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
