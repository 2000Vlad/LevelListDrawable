package com.course.levellistdrawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
     ImageView mImageView;
     int mLevel = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.imageView);
        mLevel = 1;
        mImageView.setImageLevel(mLevel);


    }
    public void charge(View view){
        if(mLevel == 10) return;
        mLevel++;
        mImageView.setImageLevel(mLevel);
    }
    public void discharge(View vIew){
        if(mLevel == 1) return;
        mLevel--;
        mImageView.setImageLevel(mLevel);
    }
}
