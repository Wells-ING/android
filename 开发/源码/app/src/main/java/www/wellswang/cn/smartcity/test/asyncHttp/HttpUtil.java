package www.wellswang.cn.smartcity.test.asyncHttp;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.BinaryHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class HttpUtil {
    private static AsyncHttpClient httpclient = new AsyncHttpClient();
    static{
        httpclient.setTimeout(5000);
    }
    public static void get(String urlString,AsyncHttpResponseHandler res)    //用一个完整url获取一个string对象

    {
        httpclient.get(urlString, res);
    }
    public static void get(String urlString, RequestParams params, AsyncHttpResponseHandler res)   //url里面带参数
    {
        httpclient.get(urlString, params,res);
    }
    public static void get(String urlString, JsonHttpResponseHandler res)   //不带参数，获取json对象或者数组
    {
        httpclient.get(urlString, res);
    }
    public static void get(String urlString,RequestParams params,JsonHttpResponseHandler res)   //带参数，获取json对象或者数组
    {
        httpclient.get(urlString, params,res);
    }
    public static void get(String uString, BinaryHttpResponseHandler bHandler)   //下载数据使用，会返回byte数据
    {
        httpclient.get(uString, bHandler);
    }
    public static void post(String uString,RequestParams params, JsonHttpResponseHandler bHandler)   //post数据使用，会返回json数据
    {
        httpclient.post(uString,params,bHandler);
    }
    public static void post(String uString,RequestParams params,AsyncHttpResponseHandler res)  //post数据使用，返回普通的手
    {
        httpclient.post(uString, params,res);
    }
    public static AsyncHttpClient getClient()
    {
        return httpclient;
    }

}
