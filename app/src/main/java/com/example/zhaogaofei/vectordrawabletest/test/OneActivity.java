package com.example.zhaogaofei.vectordrawabletest.test;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.zhaogaofei.vectordrawabletest.R;

public class OneActivity extends AppCompatActivity {

    public static void start(Context ctx) {
        Intent intent = new Intent(ctx, OneActivity.class);
        ctx.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        initView();
    }

    private void initView() {
        ImageView imageView = (ImageView) findViewById(R.id.iv_one_one);
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable)drawable).start();
        }
    }
}
