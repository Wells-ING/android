package www.wellswang.cn.smartcity.button.onclick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

import www.wellswang.cn.smartcity.R;

/**
 * 鼠标点击方法
 */
public class buttonOnclickedEvent extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        // 方法一：布局文件中button控件使用android:onClick="方法名"

        Button testtestBtn = findViewById(R.id.testBtn);

        // 方法二：匿名内部类
        testtestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(buttonOnclickedEvent.this, "Hello World", Toast.LENGTH_SHORT).show();
            }
        });

        // 方法三：实现View.OnClickListener接口，是成员内部类的一种变形
        testtestBtn.setOnClickListener(this);

        // 方法四：成员内部类
        InnerButtonOnclickedEvent i = new InnerButtonOnclickedEvent();
        testtestBtn.setOnClickListener(i);

    }
    public void doSomething() {
        Toast.makeText(buttonOnclickedEvent.this, "Hello World", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        // 常用的格式
        switch(v.getId()) {
            case R.id.testBtn:
                Toast.makeText(buttonOnclickedEvent.this, "Hello World", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    public class InnerButtonOnclickedEvent implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            // 常用的格式
            switch(v.getId()) {
                case R.id.testBtn:
                    Toast.makeText(buttonOnclickedEvent.this, "Hello World", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        }
    }


}
