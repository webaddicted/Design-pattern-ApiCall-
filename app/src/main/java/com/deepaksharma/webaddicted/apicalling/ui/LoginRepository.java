package com.deepaksharma.webaddicted.apicalling.ui;

import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.deepaksharma.webaddicted.apicalling.AppExecutors;
import com.deepaksharma.webaddicted.apicalling.apiutils.ApiResponse;
import com.deepaksharma.webaddicted.apicalling.apiutils.AppRetrofit;
import com.deepaksharma.webaddicted.apicalling.repository.NetworkBoundWtDbRes;
import com.deepaksharma.webaddicted.apicalling.ui.vo.LoginRequest;
import com.deepaksharma.webaddicted.apicalling.ui.vo.LoginResponse;
import com.deepaksharma.webaddicted.apicalling.vo.Resource;


public class LoginRepository {

    private final AppExecutors appExecutors;

    LoginRepository() {
        this.appExecutors = new AppExecutors();
    }

    LiveData<Resource<LoginResponse>> doManualLogin(final LoginRequest manualLoginRequest) {
        return new NetworkBoundWtDbRes<LoginResponse, LoginResponse>(appExecutors) {
            @NonNull
            @Override
            protected LiveData<ApiResponse<LoginResponse>> createCall() {
                return AppRetrofit.getInstance().getAppService().doManualLogin(manualLoginRequest);
            }
        }.asLiveData();
    }


//    private Converter.Factory createGsonConverter() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(ForgetPasswordResponse.class, new ForgetPasswordCustomDeserializer());
//        Gson gson = gsonBuilder.create();
//        return GsonConverterFactory.create(gson);
//    }

}
