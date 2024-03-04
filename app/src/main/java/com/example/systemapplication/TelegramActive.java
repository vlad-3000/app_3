package com.example.systemapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelegramActive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telegram_active);

        Button sendMessageButton = findViewById(R.id.telegabtn);
        sendMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTelegramMessage("sk3l3tonis", "Привет");
            }
        });
    }
    private void sendTelegramMessage(String username, String message) {
        Intent telegramIntent = new Intent(Intent.ACTION_VIEW);
        telegramIntent.putExtra(Intent.EXTRA_TEXT, message);
        telegramIntent.setData(Uri.parse("https://telegram.me/" + username));
        startActivity(telegramIntent);
    }
}