package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class Park {
    // 停车场ID
    private Integer id;
    // 停车场名称
    private String parkName;
    // 所有停车空位
    private Integer allPark;
    // 现有停车空位
    private Integer vacancy;
    // 价格上限
    private Double priceCaps;
    // 停车场图片
    private String imgUrl;
    // 费率
    private Integer rates;
    // 地址
    private String address;
    // 距离
    private Integer distance;
    // 创建停车场者
    private User creteBy;
    // 创建时间
    private Date createTime;
    // 更新停车场信息者
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

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public Integer getAllPark() {
        return allPark;
    }

    public void setAllPark(Integer allPark) {
        this.allPark = allPark;
    }

    public Integer getVacancy() {
        return vacancy;
    }

    public void setVacancy(Integer vacancy) {
        this.vacancy = vacancy;
    }

    public Double getPriceCaps() {
        return priceCaps;
    }

    public void setPriceCaps(Double priceCaps) {
        this.priceCaps = priceCaps;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getRates() {
        return rates;
    }

    public void setRates(Integer rates) {
        this.rates = rates;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
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
