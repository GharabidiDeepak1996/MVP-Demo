package com.example.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvpdemo.model.LoginPresenterImpl;
import com.example.mvpdemo.presenter.LoginPresenter;
import com.example.mvpdemo.view.LoginView;

public class MainActivity extends AppCompatActivity  implements LoginView {
EditText  email,password;
Button button;
private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        email=findViewById( R.id.email );
        password=findViewById( R.id.pass );
        button=findViewById( R.id.button );

        presenter = new LoginPresenterImpl(this);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.handleLogin( email.getText().toString(), password.getText().toString() );
            }
        } );
    }

    @Override
    public void showValidationErrorMsg() {
        Toast.makeText(this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginSuccessFully() {
        Toast.makeText(this, "Login SuccessFully", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginFail() {

        Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();

    }
}
