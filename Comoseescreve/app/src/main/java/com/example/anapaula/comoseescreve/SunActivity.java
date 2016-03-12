package com.example.anapaula.comoseescreve;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by anapaula on 11/03/16.
 */
public class SunActivity extends AppCompatActivity {

    boolean firstOk, secOk, thOk = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun);
    }

    public void putFirst(View view) {
        if (!firstOk) {
            TextView textView = (TextView) findViewById(R.id.first);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("S")) {
                textView.setTextColor(Color.rgb(0,153,0));
                firstOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }
        if(firstOk && !secOk){
            TextView textView = (TextView) findViewById(R.id.sec);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("O")) {
                textView.setTextColor(Color.rgb(0,153,0));
                secOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }
        if(firstOk && secOk && !thOk){
            TextView textView = (TextView) findViewById(R.id.th);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("L")) {
                textView.setTextColor(Color.rgb(0,153,0));
                thOk = true;
                Intent intent = new Intent(this, CongratulationsActivity.class);
                intent.putExtra(CongratulationsActivity.NEXT_KEY, FlowerActivity.class);
                startActivity(intent);
                return;
            }
            textView.setTextColor(Color.BLACK);
        }

    }
}
