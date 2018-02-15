package com.example.loborg.helloandroid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {
    public Button web_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_business);

        Typeface font = Typeface.createFromAsset( getAssets(), "fontawesome-webfont.ttf" );
        TextView phone_icon = (TextView)findViewById(R.id.phone_icon);
        phone_icon.setTypeface(font);

        TextView city_icon = (TextView)findViewById(R.id.city_icon);
        city_icon.setTypeface(font);

        TextView adr_icon = (TextView)findViewById(R.id.adr_icon);
        adr_icon.setTypeface(font);

        TextView zip_icon = (TextView)findViewById(R.id.zip_icon);
        zip_icon.setTypeface(font);

        web_button = (Button)findViewById(R.id.web_button);
        web_button.setTypeface(font);
    }

    public void showWebadress(View v){
        TextView webpage = (TextView)findViewById(R.id.webpage);
        if (webpage.getVisibility() == View.INVISIBLE) {
            webpage.setVisibility(View.VISIBLE);
        } else {
            webpage.setVisibility(View.INVISIBLE);
        }
    };
}
