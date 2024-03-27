package com.example.profilapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        LinearLayout rpl = findViewById(R.id.rpl);
        LinearLayout tkj = findViewById(R.id.tkj);
        LinearLayout akl = findViewById(R.id.akl);
        LinearLayout lokasi = findViewById(R.id.lokasi);
        LinearLayout sarpras = findViewById(R.id.sarpras);
        LinearLayout kejuaraan = findViewById(R.id.kejuaraan);
        ConstraintLayout tentang = findViewById(R.id.tentang);

        rpl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dashboard.this, rpl.class));
                finish();
            }
        });

        tkj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dashboard.this, tkj.class));
                finish();
            }
        });

        akl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dashboard.this, akl.class));
                finish();
            }
        });

        tentang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dashboard.this, tentang.class));
                finish();
            }
        });

        lokasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dashboard.this, lokasi.class));
                finish();
            }
        });

        sarpras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dashboard.this, sarpras.class));
                finish();
            }
        });

        kejuaraan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dashboard.this, kejuaraan.class));
                finish();
            }
        });


    }
}