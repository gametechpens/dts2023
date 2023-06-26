package com.pens.digitaltalent.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.pens.digitaltalent.R;

public class LoginActivity extends AppCompatActivity {

    EditText edUserName, edPassword;
    Button btnLogin;

    TextView tvPassword;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edUserName = findViewById(R.id.ed_username);
        edPassword = findViewById(R.id.ed_password);
        btnLogin = findViewById(R.id.btn_login);
        tvPassword = findViewById(R.id.tv_password);
        tvRegister = findViewById(R.id.tv_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("LoginActivity", "Test Login");
            }
        });
    }

    public void clickForgotPassword(View view) {

        Log.d("LoginActivity", "clickForgotPassword");
    }

    public void onRegister(View view) {
        Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(intent);

        Log.d("LoginActivity", "onRegister");
    }
}