package com.example.ex2_20uad002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t3=(TextView)findViewById(R.id.textView4);
        t4=(TextView)findViewById(R.id.textView5);
        Bundle bun= getIntent().getExtras();
        t3.setText(bun.getCharSequence("Username"));
        t4.setText(bun.getCharSequence("Password"));
    }
}