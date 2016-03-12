package com.example.anapaula.comoseescreve;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FlowerActivity extends AppCompatActivity {

    public boolean firstOk, secOk, thOk, fhOk = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);
    }

    public void putFirst(View view) {
        if (!firstOk) {
            TextView textView = (TextView) findViewById(R.id.first);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("F")) {
                textView.setTextColor(Color.rgb(0,153,0));
                firstOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }
        if(firstOk && !secOk){
            TextView textView = (TextView) findViewById(R.id.sec);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("L")) {
                textView.setTextColor(Color.rgb(0,153,0));
                secOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }
        if(firstOk && secOk && !thOk){
            TextView textView = (TextView) findViewById(R.id.th);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("O")) {
                textView.setTextColor(Color.rgb(0,153,0));
                thOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }
        if(firstOk && secOk && thOk){
            TextView textView = (TextView) findViewById(R.id.fh);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("R")) {
                textView.setTextColor(Color.rgb(0,153,0));
                Intent intent = new Intent(this, CongratulationsActivity.class);
                intent.putExtra(CongratulationsActivity.NEXT_KEY, CarActivity.class);
                startActivity(intent);
                fhOk = true;
                return;
            }
            textView.setTextColor(Color.BLACK);
        }

    }
}
