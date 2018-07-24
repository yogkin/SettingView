## SettingView
项目参考自LSettingView
设置界面条目封装，同时包含：

 - 设置左侧图标
 - 设置左侧文字
 - 设置右侧图标
 - 设置右侧图标是否显示
 - 设置右侧为复选框样式
 - 设置右侧为开关模式
 - 设置右侧文字及样式
 

>  **新增设置**

 - 设置左侧图标大小
 - 设置左侧图标和文字间距
 - 代码动态更改左侧文字
 - 代码动态更改右侧文字
 - 复选框和切换按钮模式下增加选中状态监听

### 运行效果：
![效果1](http://o9w936rbz.bkt.clouddn.com/github/img/LSettingView/snipaste20170525_114555.png?imageView2/0/w/500/h/1200)
![效果2](http://o9w936rbz.bkt.clouddn.com/github/img/LSettingView/Screenshot_20170331-144350.png?imageView2/0/w/500/h/1200)
![效果3](http://o9w936rbz.bkt.clouddn.com/github/img/LSettingView/Screenshot_20170331-144358.png?imageView2/0/w/500/h/1200)
![效果4](http://o9w936rbz.bkt.clouddn.com/github/img/LSettingView/Screenshot_1500614109.png?imageView2/0/w/500/h/1200)
![效果5](http://o9w936rbz.bkt.clouddn.com/github/img/LSettingView/Screenshot_1500614115.png?imageView2/0/w/500/h/1200)
![效果6](http://o9w936rbz.bkt.clouddn.com/github/img/LSettingView/Screenshot_1500614211.png?imageView2/0/w/500/h/1200)

### 快速使用
#### 1. 添加依赖

    implementation 'com.github.yogkin:SettingView:1.0.5'
    
#### 2. 在布局文件中引用

    <com.czm.settingview.SettingItem
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/item_one"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:leftIcon="@drawable/history"
        app:leftText="我的消息"/>
                
#### 3. 添加单击事件处理


    SettingItem mSettingItemOne = (SettingItem) findViewById(R.id.item_one);
    mSettingItemOne.setmOnLSettingItemClick(new SettingItem.OnLSettingItemClick() {
                @Override
                public void click(boolean isChecked) {
                    Toast.makeText(getApplicationContext(), "我的消息", Toast.LENGTH_SHORT).show();
                }
            });
     //更改左侧文字       
    mSettingItemOne.setLeftText("左侧文字");
    //更改右侧文字
    mSettingItemOne.setRightText("右侧文字");
    
    
    
### 自定义属性
#### 方法说明
| 属性        | 说明   |类型   |
| --------   | --------- |--------- |
| leftText |左侧文字|string|
| leftIcon |左侧图标|integer|
| rightIcon |右侧图标|integer|
| textSize |左侧文字大小|dimension|
| textColor |左侧文字颜色|color|
| isShowUnderLine |是否显示底部分割线|boolean|
| rightStyle |右侧图标风格|enum|
| isShowRightText |是否显示右侧文字|boolean|
| rightText |右侧文字|string|
| rightTextSize |右侧文字大小|boolean|
| rightTextColor |右侧文字颜色|color|
| leftIconSize |左侧图标大小|dimension|
| leftTextMarginLeft |左侧图标与文字间距|dimension|
#### 右侧图标风格
 
 - iconShow   显示图标
 - iconHide   隐藏图标
 - iconCheck  显示复选框
 - iconSwitch 显示切换开关
