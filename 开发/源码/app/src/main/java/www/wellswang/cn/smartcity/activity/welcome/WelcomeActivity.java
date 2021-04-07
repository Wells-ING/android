package www.wellswang.cn.smartcity.activity.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;



import java.util.ArrayList;
import java.util.List;

import www.wellswang.cn.smartcity.MainActivity;
import www.wellswang.cn.smartcity.R;

public class WelcomeActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager welcome_vp;
    private LinearLayout welcome_ll;
    private Button welcome_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcome_btn=findViewById(R.id.welcome_btn);

        initPoints(); //初始化小圆点
        initView();   //初始化数据

    }

    // 存放图片资源
    static int [] images = {R.drawable.fuwu,R.drawable.gerenzhongxin,R.drawable.huanbao,R.drawable.xinwen,R.drawable.zhuye};
    static List<View> listOfView =new ArrayList<>();

    private void initPoints()
    {
        welcome_ll=(LinearLayout)findViewById(R.id.welcome_ll); //实例化线性布局
        for (int i=0;i<images.length;i++)
        {
            View view =new View(this);
            LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(30,30);  //设置小圆点大小
            params.setMargins(10,10,10,10);  //设置间距
            view.setBackgroundResource(R.drawable.welcome_icon);   //设置图片自定义效果
            view.setLayoutParams(params); //吧设置好的视图属性设置到view中。
            welcome_ll.addView(view);     //将创建好的view添加到线性布局中。
        }
        welcome_ll.getChildAt(0).setSelected(true); //设置选中线性布局中的第一个
    }

    private void initView()      //初始化数据
    {
        welcome_vp =(ViewPager)findViewById(R.id.welcome_vp);
        Myadapter adapter =new Myadapter(); //创建适配器对象
        welcome_vp.setAdapter((adapter));
        welcome_vp.addOnPageChangeListener(this);
        welcome_vp.setCurrentItem(Integer.MAX_VALUE /2 -(Integer.MAX_VALUE/2 %8));
    }

    int index =0; //设置一个游标值记录当前的显示页面
    @Override//页面滑动时触发
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override//页面选中时的回调方法
    public void onPageSelected(int position) {
        welcome_ll.getChildAt(index).setSelected(false);
        welcome_ll.getChildAt(position%8).setSelected(true);
        index =position%8;
        if (index ==7)
        {
            welcome_ll.setVisibility(View.VISIBLE);
            welcome_btn.setVisibility(View.VISIBLE);
            welcome_btn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    // 设置回调
                    Intent intent=new Intent(WelcomeActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }else
        {
            welcome_ll.setVisibility(View.VISIBLE);
            welcome_btn.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}

