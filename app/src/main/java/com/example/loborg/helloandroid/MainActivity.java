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

        /*TextView text_1 = (TextView)findViewById(R.id.uda_name);
        text_1.setText("UdaCity");*/

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

        //For onClick
       /* web_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                showWebadress(v);
            }
        });*/

        web_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                TextView webpage = (TextView)findViewById(R.id.webpage);
                if (webpage.getVisibility() == View.INVISIBLE) {
                    webpage.setVisibility(View.VISIBLE);
                }
                return true;
            }
        });
    }

    //For onClick
    /*public void showWebadress(View v){
        web_button.setVisibility(View.VISIBLE);
    };*/
}
