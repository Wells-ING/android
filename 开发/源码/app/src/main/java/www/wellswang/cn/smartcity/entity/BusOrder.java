package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class BusOrder {
    // 巴士订单ID
    private Integer id;
    // 巴士订单号
    private String orderNum;
    // 用户ID
    private Integer userId;
    // 路线名称
    private String path;
    // 上车站点
    private String start;
    // 下车站点
    private String end;
    // 金额
    private Double price;
    // 支付状态
    private Integer status;
    // 创建巴士订单者
    private User creteBy;
    // 创建时间
    private Date createTime;
    // 更新巴士订单信息者
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

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
