package com.hgsil.wwymusicplayer.ui;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.hgsil.wwymusicplayer.R;
import com.hgsil.wwymusicplayer.beans.User;
import com.hgsil.wwymusicplayer.databinding.ActivityLoginBinding;
import com.hgsil.wwymusicplayer.http.GetDataFromHttp;

import rx.Subscriber;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding mBinding ;
    Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        mBinding.activityLoginPassword.setTransformationMethod(new PasswordTransformationMethod());
        initListener();
    }

    public void initListener(){
        //退出
        mBinding.activityLoginBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //清除输入的电话
        mBinding.activityLoginClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBinding.activityLoginPhone.setText("");
            }
        });
        //根据电话有无输入确定clear是否显示
        mBinding.activityLoginPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length()>0){
                    mBinding.activityLoginClear.setVisibility(View.VISIBLE);
                }
                else {
                    mBinding.activityLoginClear.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mBinding.activityLoginCertain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetDataFromHttp.getInstance().getUser(new Subscriber<User>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("TAG",e.toString());
                    }

                    @Override
                    public void onNext(User user) {
                        Toast.makeText(mContext,user.getAccount().getId()+"",Toast.LENGTH_SHORT).show();
                    }
                },mBinding.activityLoginPhone.getText().toString(),mBinding.activityLoginPassword.getText().toString());
            }
        });
    }
}
