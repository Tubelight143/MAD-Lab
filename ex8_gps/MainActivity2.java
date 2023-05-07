package com.example.ex8_gps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bun = getIntent().getExtras();
        String lat = bun.getString("lat");
        String lon = bun.getString("lon");
        w=(WebView)findViewById(R.id.wv);
        WebSettings webSettings = w.getSettings();
        webSettings.setJavaScriptEnabled(true);
        w.loadUrl("https://www.google.co.in/maps/@"+lat+","+lon+",13z");
        w.setWebViewClient(new WebViewClient());
    }
}