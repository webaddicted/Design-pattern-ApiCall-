package com.deepaksharma.webaddicted.apicalling.api;

import android.arch.lifecycle.LiveData;


import com.deepaksharma.webaddicted.apicalling.apiutils.ApiResponse;
import com.deepaksharma.webaddicted.apicalling.ui.vo.LoginRequest;
import com.deepaksharma.webaddicted.apicalling.ui.vo.LoginResponse;

import retrofit2.http.Body;
import retrofit2.http.POST;


/**
 * All API services, with their Url, CloudinaryResponse type, Request type and Request method(eg. GET, POST)
 */
public interface AppService {

    //method to  call the api to do the login
    @POST(ApiConstant.MANUAL_LOGIN)
    LiveData<ApiResponse<LoginResponse>> doManualLogin(@Body LoginRequest manualLoginRequest);
}

