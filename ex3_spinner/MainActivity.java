package com.example.ex3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button b;
    ImageView i;
    Spinner s;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=(ImageView)findViewById(R.id.imageView);
        b=(Button)findViewById(R.id.button);
        s=(Spinner)findViewById(R.id.spinner);
        Bitmap bg= Bitmap.createBitmap( 720,1280, Bitmap.Config.ARGB_8888);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas c=new Canvas(bg);
        Paint p=new Paint();
        p.setTextSize(30);
        p.setColor(Color.BLUE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=s.getSelectedItem().toString();
                if(st.equals("Circle"))
                {
                    c.drawText("Circle",120,150,p);
                    c.drawCircle(200,350,150,p);
                }
                else if(st.equals("Square"))
                {
                    c.drawText("Square",120,800,p);
                    c.drawRect(50,850,350,1150,p);
                }
                else
                {
                    c.drawText("Line",480,800,p);
                    c.drawLine(520,850,520,1150,p);
                }
            }
        });

    }
}