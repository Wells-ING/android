package www.wellswang.cn.smartcity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import www.wellswang.cn.smartcity.adapter.LooperPagerAdapter;

public class MainActivity extends AppCompatActivity implements MyViewPager.OnViewPagerTouchListener, ViewPager.OnPageChangeListener {

    private MyViewPager myLooperPager;
    private LooperPagerAdapter myLooperPagerAdapter;

    // 轮播图数据
    private static List<Integer> sPics = new ArrayList<>();

    private Handler myHandler;

    // 控制触碰是否停止
    private boolean myIsTouch = false;

    LinearLayout myPointContainer;

    static {
        sPics.add(R.mipmap.pic1);
        sPics.add(R.mipmap.pic2);
        sPics.add(R.mipmap.pic3);
        sPics.add(R.mipmap.pic4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 初始化视图
        initView();
        myHandler = new Handler();

    }

    private void initView() {
        // 1. 获取ViewPager
        myLooperPager = (MyViewPager) this.findViewById(R.id.looper_pager);
        // 2. 创建适配器
        myLooperPagerAdapter = new LooperPagerAdapter();
        // 3. 设置数据
        myLooperPagerAdapter.setData(sPics);
        // 4. 页面设置适配器
        myLooperPager.setAdapter(myLooperPagerAdapter);
        // 6. 设置触碰停止
        myLooperPager.setOnViewPagerTouchListener(this);
        // 添加页面监听器
        myLooperPager.addOnPageChangeListener(this);
        // 7. 根据图片的个数添加点的个数
        myPointContainer = (LinearLayout)findViewById(R.id.points_container);
        insertPoint();
        // 5. 初始化向右滑动的最大次数
        myLooperPager.setCurrentItem(myLooperPagerAdapter.getDataRealSize()*100, false);
    }

    private void insertPoint() {
        for (int i = 0; i < sPics.size(); i++) {
            View point = new View(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(40, 40);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                point.setBackground(getResources().getDrawable(R.drawable.shape_point_normal));
            }
            layoutParams.leftMargin = 20;
            point.setLayoutParams(layoutParams);
            myPointContainer.addView(point);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        // 当界面绑定窗口时
        myHandler.post(myLooperTask);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        myHandler.removeCallbacks(myLooperTask);
    }

    private Runnable myLooperTask = new Runnable() {
        @Override
        public void run() {
            if(!myIsTouch) {
                // 切换viewPager里面的图片到下一个
                int currentItem = myLooperPager.getCurrentItem();
                myLooperPager.setCurrentItem(++currentItem, false);
            }
            myHandler.postDelayed(this, 3000);
        }
    };


    @Override
    public void onPagerTouch(boolean isTouch) {
        myIsTouch = isTouch;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        // ViewPager停下来以后选中的位置
        int realPosition;
        if(myLooperPagerAdapter.getDataRealSize() != 0) {
            realPosition = position % myLooperPagerAdapter.getDataRealSize();

        } else {
            realPosition = 0;
        }
        setSelectPoint(realPosition);
    }

    private void setSelectPoint(int realPosition) {
        for (int i = 0; i < myPointContainer.getChildCount(); i++) {
            View point = myPointContainer.getChildAt(i);
            if(i != realPosition) {
                // 白色
                point.setBackgroundResource(R.drawable.shape_point_normal);
            } else {
                // 选中的颜色
                point.setBackgroundResource(R.drawable.shape_point_selected);
            }
        }
    }


    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
