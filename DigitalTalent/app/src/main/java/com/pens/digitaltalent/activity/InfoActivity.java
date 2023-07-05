package com.pens.digitaltalent.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.pens.digitaltalent.R;

public class InfoActivity extends AppCompatActivity {

    TextView tvNegara, tvIbukota, tvPosisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent myIntent = getIntent(); // ambil intent
        // ambil bundle yg dikirim
        Bundle myBundle = myIntent.getBundleExtra("Bundle");

        tvNegara = findViewById(R.id.tvNegara);
        tvIbukota = findViewById(R.id.tvIbukota);
        tvPosisi = findViewById(R.id.tvPosisi);

        //buka isi nya bundle
        tvNegara.setText(myBundle.getString("Negara"));
        tvIbukota.setText(myBundle.getString("IbuKota"));
        tvPosisi.setText("Posisi : " + myBundle.getInt("Posisi"));
    }
}