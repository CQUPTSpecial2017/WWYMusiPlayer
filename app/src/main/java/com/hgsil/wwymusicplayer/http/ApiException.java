package com.hgsil.wwymusicplayer.http;

/**
 * Created by Administrator on 2017/8/20 0020.
 */

class ApiException extends Throwable {
    public static final int NO_FOUND =404;


    public ApiException(int resultCode) {
        this(getApiExceptionMessage(resultCode));
    }

    public ApiException(String detailMessage) {
        super(detailMessage);
    }


    private static String getApiExceptionMessage(int code){
        String message = "";
        switch (code) {
            case 404:
                message = "NO FOUND ";
                break;

            default:
                message = "未知错误";

        }
        return message;
    }
}
