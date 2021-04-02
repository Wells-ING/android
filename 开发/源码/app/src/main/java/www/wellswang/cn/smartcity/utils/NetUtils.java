package www.wellswang.cn.smartcity.utils;

import android.content.Context;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import www.wellswang.cn.smartcity.callback.Callback;

/**
 * 网络访问类
 */

public class NetUtils {
    /**
     * 访问后台
     * context 上下文，即环境
     * url 相对地址
     */
    public static void request(Context context, String url, Map<String, String> params, Callback callback) {
        // 提示信息
        String title = "网络请求中";
        // 放入缓存
        String token = SPUtils.getPrefString(context, Consts.TOKEN, "");
        if(ValidateUtil.isStringValid(token)) {
            if(params == null) {
                params = new HashMap<>();
            }
            params.put(Consts.PTOKEN, token);
        }
        // 使用OkHttp访问后台
        OkHttpUtils.post().url(getUrl(context, url)).params(params).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onResponse(String response, int id) {

            }
        });
    }

    /**
     * 给url加上根地址
     */
    private static String getUrl(Context context, String url) {
        String baseUrl = SPUtils.getPrefString(context, Consts.BASE_URL, "");
        if(ValidateUtil.isStringValid(baseUrl)) {
            if(baseUrl.endsWith("/")) {
                baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
            }
        }
        return baseUrl + url;
    }
}
