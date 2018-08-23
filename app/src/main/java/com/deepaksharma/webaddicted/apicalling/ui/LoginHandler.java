package com.deepaksharma.webaddicted.apicalling.ui;

public class LoginHandler {

    LoginListener mLoginListener;

    public LoginHandler(LoginListener loginListener) {
        this.mLoginListener = loginListener;
    }

    public void loginClick() {
        mLoginListener.loginClick();
    }

}
