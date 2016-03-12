package com.example.anapaula.comoseescreve;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CarActivity extends AppCompatActivity {

    boolean firstOk, secOk, thOk, fhOk = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
    }

    public void putFirst(View view) {
        if (!firstOk) {
            TextView textView = (TextView) findViewById(R.id.first);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("C")) {
                textView.setTextColor(Color.rgb(0,153,0));
                firstOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }
        if(firstOk && !secOk){
            TextView textView = (TextView) findViewById(R.id.sec);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("A")) {
                textView.setTextColor(Color.rgb(0,153,0));
                secOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }
        if(firstOk && secOk && !thOk){
            TextView textView = (TextView) findViewById(R.id.th);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("R")) {
                textView.setTextColor(Color.rgb(0,153,0));
                thOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }
        if(firstOk && secOk && thOk && !fhOk){
            TextView textView = (TextView) findViewById(R.id.fh);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("R")) {
                textView.setTextColor(Color.rgb(0,153,0));
                fhOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }

        if(firstOk && secOk && thOk && fhOk){
            TextView textView = (TextView) findViewById(R.id.five);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("O")) {
                textView.setTextColor(Color.rgb(0,153,0));
                Intent intent = new Intent(this, CongratulationsActivity.class);
                intent.putExtra(CongratulationsActivity.NEXT_KEY, BeeActivity.class);
                startActivity(intent);
                return;
            }
            textView.setTextColor(Color.BLACK);
        }

    }


}
