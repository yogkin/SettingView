package czm.settingview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


import com.czm.settingview.SettingView;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private SettingView mSettingItemOne;
    private SettingView mSettingItemFour;
    private ImageView mIvHead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSettingItemOne = (SettingView) findViewById(R.id.item_one);
        mSettingItemFour = (SettingView) findViewById(R.id.item_four);
        mIvHead = (ImageView) findViewById(R.id.headimage);

        mSettingItemOne.setmOnLSettingItemClick(new SettingView.OnLSettingItemClick() {
            @Override
            public void click(boolean isChecked) {
                Toast.makeText(getApplicationContext(), "我的消息", Toast.LENGTH_SHORT).show();
            }
        });
        mSettingItemFour.setmOnLSettingItemClick(new SettingView.OnLSettingItemClick() {
            @Override
            public void click(boolean isChecked) {
                Toast.makeText(getApplicationContext(), "选中开关：" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });
        mSettingItemOne.setRightText("我是右侧改变的文字");

        Picasso.get().load(R.drawable.girl).transform(new CircleTransform()).into(mIvHead);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.item_one:
                Toast.makeText(getApplicationContext(), "我的消息", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
