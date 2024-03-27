package com.example.profilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class sarpras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarpras);
    }

    @Override
    public void onBackPressed() {
        // Create an Intent to launch MainActivity
        Intent intent = new Intent(this, dashboard.class);
        // Add any extra data to the intent if needed
        // intent.putExtra("key", value);
        // Start the MainActivity
        startActivity(intent);
    }
}