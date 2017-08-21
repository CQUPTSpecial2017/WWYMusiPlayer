package com.hgsil.wwymusicplayer.http;

import com.hgsil.wwymusicplayer.beans.User;
import com.hgsil.wwymusicplayer.config.Const;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/8/20 0020.
 */

public class GetDataFromHttp<T> {
    private static final int DEFAULT_TIMEOUT = 5;

    private Retrofit retrofit;
    private WWYServer mServer;

    public static GetDataFromHttp getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final GetDataFromHttp INSTANCE = new GetDataFromHttp();
    }
    public GetDataFromHttp() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Const.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        mServer = retrofit.create(WWYServer.class);
    }
    public void getUser(Subscriber<User> subscriber,String phone,String password){
        Observable<User> mObservable = mServer.getUser(phone,password).map(new HttpResultFunc());
        initObservable(mObservable,subscriber);
    }
    private <T> Subscription initObservable(Observable<T> o, Subscriber<T> s) {
        return o.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s);
    }
    private class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {

        @Override
        public T call(HttpResult<T> httpResult) {
            if (httpResult.getStatus() == 404) {
                try {
                    throw new ApiException(404);
                } catch (ApiException e) {
                    e.toString();
                }
            }
            return httpResult.getData();
        }
    }

}
