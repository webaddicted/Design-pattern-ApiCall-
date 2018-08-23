package com.deepaksharma.webaddicted.apicalling.ui;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.os.Build;


import com.deepaksharma.webaddicted.apicalling.ui.vo.LoginRequest;
import com.deepaksharma.webaddicted.apicalling.ui.vo.LoginResponse;
import com.deepaksharma.webaddicted.apicalling.utils.AbsentLiveData;
import com.deepaksharma.webaddicted.apicalling.vo.Resource;

import java.util.Objects;

public class LoginViewModel extends ViewModel {
    LoginRepository loginRepository;
    String TAG = LoginViewModel.class.getSimpleName();
    final MutableLiveData<LoginRequest> manualLoginRequest = new MutableLiveData<LoginRequest>();
    private LiveData<Resource<LoginResponse>> manualLoginResponse;

    public LoginViewModel() {
        loginRepository = new LoginRepository();
        manualLoginResponse = Transformations.switchMap(manualLoginRequest, updateUrlNameRequest -> {
            if (updateUrlNameRequest == null)
                return AbsentLiveData.create();
           else
                return loginRepository.doManualLogin(updateUrlNameRequest);
        });
    }

    public void setManualLoginRequest(LoginRequest manualLoginRequest) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Objects.equals(this.manualLoginRequest.getValue(), manualLoginRequest)) {
                return;
            }
        }
        this.manualLoginRequest.setValue(manualLoginRequest);
    }

    public LiveData<Resource<LoginResponse>> getManualLoginResponse() {
        return manualLoginResponse;
    }

    public LoginRequest getRequest(String email, String password) {
        LoginRequest manualLoginRequest = new LoginRequest();
        manualLoginRequest.setEmail(email);
        manualLoginRequest.setPassword(password);
        manualLoginRequest.setDevice_token("Sfng vbj hbhs");
        manualLoginRequest.setDevice_type(1);
        manualLoginRequest.setLat("25.52525252");
        manualLoginRequest.setLng("75.15963285");
        return manualLoginRequest;
    }

}
