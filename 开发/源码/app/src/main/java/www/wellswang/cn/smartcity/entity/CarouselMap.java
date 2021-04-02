package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class CarouselMap {
    // 轮播图ID
    private Integer id;
    // 轮播图链接
    private String imgUrl;
    // 轮播图类型
    private Integer type;
    // 创建时间
    private Date createTime;
    // 排序方式
    private Integer sort;
    // 布局
    private String dispaly;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDispaly() {
        return dispaly;
    }

    public void setDispaly(String dispaly) {
        this.dispaly = dispaly;
    }

    @Override
    public String toString() {
        return "CarouselMap{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", type=" + type +
                ", createTime=" + createTime +
                ", sort=" + sort +
                ", dispaly='" + dispaly + '\'' +
                '}';
    }
}
