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

        tvHasil = findViewById(R.id.tv_hasil);
        edInputName = findViewById(R.id.ed_name);


    }

    public void postSubmit(View view) {
        String name = edInputName.getText().toString();
        tvHasil.setText(name);

    }
}