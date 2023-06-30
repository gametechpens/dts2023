package com.pens.digitaltalent.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.pens.digitaltalent.R;

public class MainActivity extends AppCompatActivity {

    EditText edInputName;
    TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edInputName = findViewById(R.id.ed_name);


    }


    public void postTanpaData(View view) {
    }
}