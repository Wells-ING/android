package www.wellswang.cn.smartcity.test.okhttpTest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import www.wellswang.cn.smartcity.R;

public class OkHttpTest extends Activity {

    private TextView txtView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp);

        // 获得初始化
        txtView = findViewById(R.id.txtView);


        OkHttpClient client = new OkHttpClient();
        String url = "https://reqres.in/api/users?page=2";
        String url2 = "http://124.93.196.45:10002/userinfo/rotation/lists?pageNum=1&pageSize=10&type=47";
        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                if(response.isSuccessful()) {
                    final String myResponse = response.body().string();
                    OkHttpTest.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
//                            txtView.setText(myResponse);
                            Toast.makeText(OkHttpTest.this, myResponse, Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

    }
}
