package www.wellswang.cn.smartcity.entity;

import java.util.Date;

public class FirstService {
    // 类别ID
    private Integer dictCode;
    // 类别名称
    private String dictLabel;
    // 类别编号
    private Integer dictValue;
    // 类别类型
    private String dictType;
    // 类别排序
    private Integer dictSort;
    // cssClass
    private Integer cssClass;
    // listClass
    private Integer listClass;
    // 是否是默认，例如：N
    private String isDefault;
    // default
    private Boolean Default;
    // 创建一级服务者
    private User createBy;
    // 创建时间
    private Date createTime;
    // 更新一级服务者
    private User updateBy;
    // 更新时间
    private Date updateTime;
    // 标志
    private String remark;
    // 状态
    private Integer status;

    public Integer getDictCode() {
        return dictCode;
    }

    public void setDictCode(Integer dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictLabel() {
        return dictLabel;
    }

    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel;
    }

    public Integer getDictValue() {
        return dictValue;
    }

    public void setDictValue(Integer dictValue) {
        this.dictValue = dictValue;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    public Integer getCssClass() {
        return cssClass;
    }

    public void setCssClass(Integer cssClass) {
        this.cssClass = cssClass;
    }

    public Integer getListClass() {
        return listClass;
    }

    public void setListClass(Integer listClass) {
        this.listClass = listClass;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getDefault() {
        return Default;
    }

    public void setDefault(Boolean aDefault) {
        Default = aDefault;
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

    @Override
    public String toString() {
        return "FirstService{" +
                "dictCode=" + dictCode +
                ", dictLabel='" + dictLabel + '\'' +
                ", dictValue=" + dictValue +
                ", dictType='" + dictType + '\'' +
                ", dictSort=" + dictSort +
                ", cssClass=" + cssClass +
                ", listClass=" + listClass +
                ", isDefault='" + isDefault + '\'' +
                ", Default=" + Default +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", updateBy=" + updateBy +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                '}';
    }
}
