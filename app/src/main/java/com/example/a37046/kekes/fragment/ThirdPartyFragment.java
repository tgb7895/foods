package com.example.a37046.kekes.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a37046.kekes.base.BaseFragment;

public class ThirdPartyFragment extends BaseFragment {

    private TextView textView;
    private static final String Tag=ThirdPartyFragment.class.getSimpleName();//CommonFrameFragment

    @Override
    protected View initView() {

        Log.d(Tag,"第三方Fragment初始化");
        textView=new TextView(mContext);
        textView.setTextSize(20);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        Toast.makeText(mContext, "我是碎片2", Toast.LENGTH_SHORT).show();
        return null;

    }

    @Override
    protected void initData() {
        super.initData();
        Log.d(Tag,"页面数据初始化");
        textView.setText("第三方页面");
    }
}
