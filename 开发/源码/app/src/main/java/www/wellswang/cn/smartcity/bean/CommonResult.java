package www.wellswang.cn.smartcity.bean;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import www.wellswang.cn.smartcity.utils.ValidateUtil;

/**
 * 网络访问返回的对象
 */

public class CommonResult {

    // 状态
    private String state;
    // 描述
    private String msg;
    // 临时的标记，表明用户登录了
    private String token;
    // 数据对象
    private JSONObject data;
    // 数据列表
    private JSONArray rows;
    private JSONArray value; // 更通用
    private JSONArray values;  // 更通用
    // array的数量
    private int total;

    /**
     * rows转换成String字符串
     * @return
     */
    public String getRowsString() {
        return ValidateUtil.isJaValid(rows) ? rows.toString() : "";
    }

    /**
     * value转换成String字符串
     * @return
     */
    public String getValueString() {
        return ValidateUtil.isJaValid(value) ? value.toString() : "";
    }

    /**
     * values转换成String字符串
     * @return
     */
    public String getValuesString() {
        return ValidateUtil.isJaValid(values) ? values.toString() : "";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public JSONArray getRows() {
        return rows;
    }

    public void setRows(JSONArray rows) {
        this.rows = rows;
    }

    public JSONArray getValue() {
        return value;
    }

    public void setValue(JSONArray value) {
        this.value = value;
    }

    public JSONArray getValues() {
        return values;
    }

    public void setValues(JSONArray values) {
        this.values = values;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
