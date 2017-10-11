package com.example.zhaogaofei.vectordrawabletest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhaogaofei.vectordrawabletest.test.OneActivity;
import com.example.zhaogaofei.vectordrawabletest.test.ThreeActivity;
import com.example.zhaogaofei.vectordrawabletest.test.TwoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Context mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;
        initView();
    }

    private void initView() {
        Button btOne = (Button) findViewById(R.id.bt_one);
        btOne.setOnClickListener(this);

        Button btTwo = (Button) findViewById(R.id.bt_two);
        btTwo.setOnClickListener(this);

        Button btThree = (Button) findViewById(R.id.bt_three);
        btThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_one:
                OneActivity.start(mActivity);
                break;
            case R.id.bt_two:
                TwoActivity.start(mActivity);
                break;
            case R.id.bt_three:
                ThreeActivity.start(mActivity);
                break;
        }
    }
}
