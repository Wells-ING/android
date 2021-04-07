package www.wellswang.cn.smartcity.activity.welcome;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Myadapter extends PagerAdapter {

    @Override
    public int getCount() {
        return WelcomeActivity.listOfView.size(); //实现只能滑动一遍图片的效果
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view ==object;
    }

    public Myadapter()    //重写构造方法，将数据添加到集合种
    {
        for (int i=0;i<WelcomeActivity.images.length;i++) //创建ImageView存放图片
        {
            ImageView iv=new ImageView((getApplicationContext()));
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            iv.setImageResource(WelcomeActivity.images[i]);
            WelcomeActivity.listOfView.add(iv);
        }
    }

    private Context getApplicationContext() {
        return null;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(WelcomeActivity.listOfView.get(position%8));
        return WelcomeActivity.listOfView.get(position%8);
    }

    @Override  // 销毁一个view对象
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(WelcomeActivity.listOfView.get(position%8));
    }
}
