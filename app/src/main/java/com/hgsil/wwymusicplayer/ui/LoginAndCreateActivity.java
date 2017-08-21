package com.hgsil.wwymusicplayer.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.hgsil.wwymusicplayer.R;
import com.hgsil.wwymusicplayer.databinding.ActivityLoginAndCreateBinding;

public class LoginAndCreateActivity extends AppCompatActivity {
    ActivityLoginAndCreateBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_login_and_create);

        initListener();



    }

    private void initListener(){
        mBinding.activityLoginAndCreateLoginButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mBinding.activityLoginAndCreateLoginButtonText.setBackgroundResource(R.drawable.text_circle_select);
                mBinding.activityLoginAndCreateLoginButtonText.setTextColor(Color.WHITE);
                if (motionEvent.getAction() == MotionEvent.ACTION_UP){
                    mBinding.activityLoginAndCreateLoginButtonText.setBackgroundResource(R.drawable.text_circle);
                    mBinding.activityLoginAndCreateLoginButtonText.setTextColor(Color.parseColor("#d33a31"));
                }
                return false;
            }
        });

        mBinding.activityLoginAndCreateCreateButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mBinding.activityLoginAndCreateCreateButtonText.setBackgroundResource(R.drawable.text_circle_select);
                mBinding.activityLoginAndCreateCreateButtonText.setTextColor(Color.WHITE);
                if (motionEvent.getAction() == MotionEvent.ACTION_UP){
                    mBinding.activityLoginAndCreateCreateButtonText.setBackgroundResource(R.drawable.text_circle);
                    mBinding.activityLoginAndCreateCreateButtonText.setTextColor(Color.parseColor("#d33a31"));
                }
                return false;
            }
        });

        mBinding.activityLoginAndCreateLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginAndCreateActivity.this,LoginActivity.class));
            }
        });




    }
}
