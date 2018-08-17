package com.sunruncn.sunruntvservices;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
        findViewById(R.id.button10).setOnClickListener(this);
        findViewById(R.id.button11).setOnClickListener(this);
        findViewById(R.id.button12).setOnClickListener(this);
        findViewById(R.id.button13).setOnClickListener(this);
        findViewById(R.id.button14).setOnClickListener(this);
        findViewById(R.id.button15).setOnClickListener(this);
        findViewById(R.id.button16).setOnClickListener(this);
        findViewById(R.id.button17).setOnClickListener(this);
        findViewById(R.id.button18).setOnClickListener(this);
        findViewById(R.id.button19).setOnClickListener(this);
        findViewById(R.id.button20).setOnClickListener(this);
        findViewById(R.id.button21).setOnClickListener(this);
        findViewById(R.id.button22).setOnClickListener(this);
        editText = findViewById(R.id.edittext);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.button1:
                //启动 VST 软件
                intent = new Intent("myvst.intent.action.LancherActivity");
                break;
            case R.id.button2:
                //启动记录收藏模块
                intent = new Intent("myvst.intent.action.RecodeActivity");
                break;
            case R.id.button3:
                //启动到搜索界面
                intent = new Intent("myvst.intent.action.SearchActivity");
                intent.putExtra("search_word", editText.getText().toString());
                break;
            case R.id.button4:
                //启动到排行榜
                intent = new Intent("myvst.intent.action.ToptenzOfFilmActivity");
                break;
            case R.id.button5:
                //启动到专题列表
                intent = new Intent("myvst.intent.action.TopicListActivity");
                break;
            case R.id.button6:
                //启动到轮播播放 软件上的看电视版块
                if (findViewById(R.id.button6).getTag().equals("0")) {
                    intent = new Intent("myvst.intent.action.LivePlayer");
                    findViewById(R.id.button6).setTag("1");
                } else if (findViewById(R.id.button6).getTag().equals("1")) {
                    intent = new Intent("com.vst.v1.live.ACTION_LIVE_BACK");
                    findViewById(R.id.button6).setTag("2");
                } else {
                    intent = new Intent("com.VST.V1.ACTION.startLive");
                    findViewById(R.id.button6).setTag("0");
                }
                break;
            case R.id.button7:
                //启动到新闻播放 软件上的每日头条版块
                //到每日头条版块
                intent = new Intent("myvst.intent.action.CompatiblePlayer");
                break;
            case R.id.button8:
                //启动影片分类
                //1 电影2 电视剧3 动漫4 综艺5 记录片
                intent = new Intent("myvst.intent.action.VodTypeActivity");
                if (findViewById(R.id.button8).getTag().equals("0")) {
                    intent.putExtra("vodtype", 0);
                    findViewById(R.id.button6).setTag("1");
                } else if (findViewById(R.id.button8).getTag().equals("1")) {
                    intent.putExtra("vodtype", 1);
                    findViewById(R.id.button6).setTag("2");
                } else if (findViewById(R.id.button8).getTag().equals("2")) {
                    intent.putExtra("vodtype", 2);
                    findViewById(R.id.button6).setTag("3");
                } else if (findViewById(R.id.button8).getTag().equals("3")) {
                    intent.putExtra("vodtype", 3);
                    findViewById(R.id.button6).setTag("4");
                } else if (findViewById(R.id.button8).getTag().equals("4")) {
                    intent.putExtra("vodtype", 4);
                    findViewById(R.id.button6).setTag("0");
                }
                break;
            case R.id.button9:
                //启动到全部应用
                intent = new Intent("myvst.intent.action.ApplicationActivity");
                break;
            case R.id.button10:
                //启动到应用市场 软件上的应用精选版块
                intent = new Intent("myvst.intent.action.AppMarketActivity");
                break;
            case R.id.button11:
                //启动到偏好设置
                intent = new Intent("myvst.intent.action.StartupSettingActivity");
                break;
            case R.id.button12:
                //启动到播放设置
                intent = new Intent("myvst.intent.action.VodSettingActivity");
                break;
            case R.id.button13:
                //启动到速度优化
                intent = new Intent("myvst.intent.action.ClearDataActivity");
                break;
            case R.id.button14:
                //启动到壁纸设置
                intent = new Intent("myvst.intent.action.WallpaperSettingActivity");
                break;
            case R.id.button15:
                //启动到天气设置
                intent = new Intent("myvst.intent.action.WeatherSettingActivity");
                break;
            case R.id.button16:
                //启动到万花筒主页
                intent = new Intent("myvst.intent.wemedia.WeMediaActivity");
                break;
            case R.id.button17:
                //启动到新版体育
                intent = new Intent("myvst.intent.sport.SportHomeActivity");
                break;
            case R.id.button18:
                //启动到全球购
                if (findViewById(R.id.button18).getTag().equals("0")) {
                    //主页
                    intent = new Intent("net.myvst.v2.action.ShoppingHomeActivity");
                    findViewById(R.id.button18).setTag("1");
                } else {
                    //搜索
                    intent = new Intent("com.vst.vstshopping.activity.search");
                    findViewById(R.id.button18).setTag("0");
                }
                break;
            case R.id.button19:
                //启动到火热专区   主页
                intent = new Intent("myvst.intent.prefecture.PrefectureHomeActivity");
                break;
            case R.id.button20:
                //少儿首页
                intent = new Intent();
                intent.setAction("android.intent.action.vst.children");
                break;
            case R.id.button21:
                //启动到Live版块
                intent = new Intent();
                intent.setAction("myvst.intent.sport.SportStartActivity");
                break;
            case R.id.button22:
                //网络优化模的调用方式
                intent = new Intent();
                intent.setAction("android.intent.action.Wifianalyze.Home");
                break;
        }
        if (intent != null) {
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            try {
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
