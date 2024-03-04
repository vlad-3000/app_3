package com.example.systemapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_active);

        Button imagetest = findViewById(R.id.testimvw);
        imagetest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CameraActive();
            }
        });
        Button telegabtn = findViewById(R.id.tgtesting);
        telegabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TelegramActive();
            }
        });
        Button testcall = findViewById(R.id.calltest);
        testcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallActive();
            }
        });
        Button testinet = findViewById(R.id.inettesting);
        testinet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InternetActive();
            }
        });
    }

    private void CameraActive() {
        Intent intent = new Intent(this, CameraActive.class);
        startActivity(intent);
    }
    private void TelegramActive() {
        Intent intent = new Intent(this, TelegramActive.class);
        startActivity(intent);
    }
    private void CallActive() {
        Intent intent = new Intent(this, CallActive.class);
        startActivity(intent);
    }
    private void InternetActive() {
        Intent intent = new Intent(this, InternetActive.class);
        startActivity(intent);
    }
}




