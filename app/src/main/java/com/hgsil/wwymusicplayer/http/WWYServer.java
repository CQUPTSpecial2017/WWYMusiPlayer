package com.hgsil.wwymusicplayer.http;

import com.hgsil.wwymusicplayer.beans.User;

import java.util.Observable;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by Administrator on 2017/8/20 0020.
 */

public interface WWYServer {

    @GET("login/cellphone")
    rx.Observable<HttpResult<User>> getUser(@Query("phone")String phone,@Query("password")String password);



}
