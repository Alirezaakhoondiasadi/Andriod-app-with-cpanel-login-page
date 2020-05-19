package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText UsernameEt , PasswordEt ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameEt = (EditText)findViewById(R.id.etUsername) ;
        PasswordEt = (EditText)findViewById(R.id.etPassword) ;

    }
    public void OnLogin(View view){
        String username = UsernameEt.getText().toString() ;
        String password = PasswordEt.getText().toString() ;
        String type = "login" ;
        UserAuthentication userAuthentication = new UserAuthentication(this) ;

        userAuthentication.execute(type, username, password);
    }

}
