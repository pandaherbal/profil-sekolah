package com.example.profilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class rpl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpl);
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