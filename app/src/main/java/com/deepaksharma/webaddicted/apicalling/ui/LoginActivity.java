package com.deepaksharma.webaddicted.apicalling.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Patterns;


import com.deepaksharma.webaddicted.apicalling.R;
import com.deepaksharma.webaddicted.apicalling.databinding.ActivityApiBinding;
import com.deepaksharma.webaddicted.apicalling.ui.vo.LoginRequest;
import com.deepaksharma.webaddicted.apicalling.ui.vo.LoginResponse;
import com.deepaksharma.webaddicted.apicalling.vo.Resource;
import com.deepaksharma.webaddicted.apicalling.vo.Status;

public class LoginActivity extends AppCompatActivity implements LoginListener {
    String TAG = LoginActivity.class.getSimpleName();
    ActivityApiBinding activityLoginBinding;
    LoginViewModel loginViewModel;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_api);
        activityLoginBinding.setViewModel(new LoginHandler(this));
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
    }

    @Override
    public void loginClick() {
        String strUserName = activityLoginBinding.edtEmailId.getText().toString();
        String strPassword = activityLoginBinding.edtPassword.getText().toString();
        final LoginRequest manualLoginRequest = loginViewModel.getRequest(strUserName, strPassword);
        if (checkLoginValidation(manualLoginRequest)) loginRequest();
    }

    private boolean checkLoginValidation(LoginRequest manualLoginRequest) {
        Log.d(TAG, "onResponse: checkLoginValidation:\n email - > " + manualLoginRequest.getEmail() + "\n Password  -> " + manualLoginRequest.getPassword() + "\n token - >" + manualLoginRequest.getDevice_token() + "\n getLat-> " + manualLoginRequest.getLat() + "\n getLng -> " + manualLoginRequest.getLng() + "\n getDevice_type -> " + manualLoginRequest.getDevice_type());
        if (manualLoginRequest.getEmail() == null && manualLoginRequest.getEmail().isEmpty() && manualLoginRequest.getEmail().equals("")) {
            activityLoginBinding.edtEmailId.setError(getResources().getString(R.string.email_error));
        } else if (!Patterns.EMAIL_ADDRESS.matcher(manualLoginRequest.getEmail()).matches()) {
            activityLoginBinding.edtEmailId.setError(getResources().getString(R.string.valid_email));
        } else if (manualLoginRequest.getPassword() == null && manualLoginRequest.getPassword().isEmpty() && manualLoginRequest.getPassword().equals("")) {
            activityLoginBinding.edtEmailId.setError(null);
            activityLoginBinding.edtPassword.setError(getResources().getString(R.string.password_error));
        } else {
            activityLoginBinding.edtEmailId.setError(null);
            activityLoginBinding.edtPassword.setError(null);
            return true;
        }
        return false;
    }

    private void loginRequest() {
        final LoginRequest manualLoginRequest = loginViewModel.getRequest(email, password);
        loginViewModel.setManualLoginRequest(manualLoginRequest);
        if (!loginViewModel.getManualLoginResponse().hasActiveObservers()) {
            loginViewModel.getManualLoginResponse().observe(this, new Observer<Resource<LoginResponse>>() {
                @Override
                public void onChanged(@Nullable Resource<LoginResponse> manualLoginRes) {
                    if (manualLoginRes != null && manualLoginRes.status != Status.LOADING)
                        if (manualLoginRes != null && manualLoginRes.data != null) {
                            if (!manualLoginRes.data.getStatus()) {
                                activityLoginBinding.txtApiResult.setText("Message -> " + manualLoginRes.data.getMessage() + "\n Status -> " + manualLoginRes.data.getStatus());
                                Log.d(TAG, "onResponse: onChanged: " + manualLoginRes.data.getMessage() + "\n Status -> " + manualLoginRes.data.getStatus());
                            } else {
                                Log.d(TAG, "onResponse: onChanged:  response null ->  ");
                            }
                        }
                }
            });
        }
    }
}
