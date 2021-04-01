package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class Bus {
    // 巴士路线ID
    private Integer id;
    // 巴士路线名称
    private String name;
    // 上车站点
    private String start;
    // 下车站点
    private String end;
    // 开始运营时间
    private Date startTime;
    // 结束运营时间
    private Date endTime;
    // 价格
    private Double price;
    // 里程
    private Integer mileage;
    // 创建巴士路线者
    private User creteBy;
    // 创建时间
    private Date createTime;
    // 更新巴士路线信息者
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
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
