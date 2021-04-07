package www.wellswang.cn.smartcity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Fragment fragment_home;
    private Fragment fragment_service;
    private Fragment fragment_protect;
    private Fragment fragment_news;
    private Fragment fragment_personal;

    private LinearLayout line_home;
    private LinearLayout line_service;
    private LinearLayout line_protect;
    private LinearLayout line_news;
    private LinearLayout line_personal;

    private ImageView iv_home;
    private ImageView iv_service;
    private ImageView iv_protect;
    private ImageView iv_news;
    private ImageView iv_personal;

    private TextView tv_home;
    private TextView tv_service;
    private TextView tv_protect;
    private TextView tv_news;
    private TextView tv_personal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView(); //初始化各个控件

        initEvent(); //  初始化点击触发事件

        initFragment(1);  // 初始化Fragment


    }


    public void initView()
    {
        line_home = (LinearLayout) findViewById(R.id.line1);
        line_service = (LinearLayout) findViewById(R.id.line2);
        line_protect = (LinearLayout) findViewById(R.id.line3);
        line_news = (LinearLayout) findViewById(R.id.line4);
        line_personal = (LinearLayout) findViewById(R.id.line5);

        iv_home = (ImageView) findViewById(R.id.ic_1);
        iv_service = (ImageView) findViewById(R.id.ic_2);
        iv_protect= (ImageView) findViewById(R.id.ic_3);
        iv_news= (ImageView) findViewById(R.id.ic_4);
        iv_personal= (ImageView) findViewById(R.id.ic_5);

        tv_home = (TextView) findViewById(R.id.textview_1);
        tv_service = (TextView) findViewById(R.id.textview_2);
        tv_protect = (TextView) findViewById(R.id.textview_3);
        tv_news = (TextView) findViewById(R.id.textview_4);
        tv_personal = (TextView) findViewById(R.id.textview_5);


    }

    private void initFragment(int index)
    {

    }

    private void initEvent() {
        line_home.setOnClickListener(this);
        line_service.setOnClickListener(this);
        line_protect.setOnClickListener(this);
        line_news.setOnClickListener(this);
        line_personal.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {



    }
}
