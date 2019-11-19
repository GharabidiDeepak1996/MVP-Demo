package com.example.mvpdemo.model;

import android.text.TextUtils;

import com.example.mvpdemo.presenter.LoginPresenter;
import com.example.mvpdemo.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter {

    private LoginView loginView;
    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void handleLogin(String Email, String Password) {
        if ((TextUtils.isEmpty( Email ) || TextUtils.isEmpty( Password ))) {
            loginView.showValidationErrorMsg();
        } else {
            if (Email.equals( "Standerd" ) && Password.equals( "Standerd" )) {
                loginView.loginSuccessFully();
            } else {
                loginView.loginFail();
            }
        }
    }
}
