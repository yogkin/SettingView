package czm.settingview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


import com.czm.settingview.SettingView;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {
    private SettingView mSettingItemOne;
    private SettingView mSettingItemFour;
    private ImageView mIvHead;
    private SettingView mSettingItemTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSettingItemOne = (SettingView) findViewById(R.id.item_one);
        mSettingItemFour = (SettingView) findViewById(R.id.item_four);
        mSettingItemTwo = (SettingView) findViewById(R.id.item_two);
        mIvHead = (ImageView) findViewById(R.id.headimage);

        mSettingItemOne.setmOnLSettingItemClick(new SettingView.OnLSettingItemClick() {
            @Override
            public void click(boolean isChecked) {
                Toast.makeText(getApplicationContext(), mSettingItemTwo.getRightEdittextStr(), Toast.LENGTH_SHORT).show();
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


}
