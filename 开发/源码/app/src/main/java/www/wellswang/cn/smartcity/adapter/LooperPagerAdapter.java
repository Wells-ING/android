package www.wellswang.cn.smartcity.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class LooperPagerAdapter extends PagerAdapter {

    private List<Integer> mPics = null;

    @Override
    public int getCount() {
        if(mPics != null) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        int realPosition = position % mPics.size();
        ImageView imageView = new ImageView(container.getContext());
        // 图片拉伸，和ImageView控件一样大
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(mPics.get(realPosition));
        // 数据设置好之后，添加到容器
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public void setData(List<Integer> colors) {
        this.mPics = colors;
    }

    public int getDataRealSize() {
        if(mPics != null) {
            return mPics.size();
        }
        return 0;
    }
}
