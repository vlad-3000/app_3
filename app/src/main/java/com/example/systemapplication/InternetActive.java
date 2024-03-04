package com.example.systemapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class InternetActive extends AppCompatActivity {

    private WebView webView;
    private EditText editText;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_active);

        webView = findViewById(R.id.weburl);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.accepturl);

        webView.setWebViewClient(new WebViewClient());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editText.getText().toString();

                webView.loadUrl(url);
            }
        });
    }
}