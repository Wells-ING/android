package www.wellswang.cn.smartcity.activity;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import www.wellswang.cn.smartcity.MainActivity;
import www.wellswang.cn.smartcity.R;

public class GuideActivity extends Activity implements ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private List<View> views;
    private LinearLayout pointLayout;
    private ImageView[] imageViews;
    // 当前正在显示的卡页
    private int currentIndex;
    // 进入应用按钮
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initViews();
        initPoint();
        InnerButtonOnclickedEvent i = new InnerButtonOnclickedEvent();
        btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(i);
    }

    private void initViews() {
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        views = new ArrayList<>();
        views.add(getLayoutInflater().inflate(R.layout.layout1, null));
        views.add(getLayoutInflater().inflate(R.layout.layout2, null));
        views.add(getLayoutInflater().inflate(R.layout.layout3, null));
        views.add(getLayoutInflater().inflate(R.layout.layout4, null));

        viewPager.setOnPageChangeListener(this);
        viewPager.setAdapter(new MyPagerAdapter());
    }

    private void initPoint() {
        pointLayout = (LinearLayout)findViewById(R.id.point_layout);
        imageViews = new ImageView[views.size()];
        for(int i = 0; i < imageViews.length; i++) {
            imageViews[i] = (ImageView) pointLayout.getChildAt(i);
        }
        currentIndex = 0;
        imageViews[currentIndex].setImageResource(R.drawable.shape_point_selected);
    }

    // 设置圆点状态和按钮的显示
    private void setCurrentPoint(int position) {
        if(currentIndex < 0 || currentIndex == position || currentIndex > imageViews.length-1) {
            return;
        }
        imageViews[currentIndex].setImageResource(R.drawable.shape_point_normal);
        imageViews[position].setImageResource(R.drawable.shape_point_selected);
        currentIndex = position;
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        setCurrentPoint(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    // 适配器
    class MyPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return views.size();
        }

        @NonNull
        @Override
        // 增加选项卡
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View v = views.get(position);
            container.addView(v);
            return v;
        }

        // 删除选项卡
        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView(views.get(position));
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

    }
    public class InnerButtonOnclickedEvent implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            // 常用的格式
            switch(v.getId()) {
                case R.id.btn_start:
                    Intent intent = new Intent(GuideActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    }
}
