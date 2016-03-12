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

    private boolean firstOk;
    private boolean secondOk;
    private boolean thirdOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun);
        firstOk = false;
        secondOk = false;
        thirdOk = false;
    }

    public void putFirst(View view) {
        if (!this.isFirstOk()) {
            TextView textView = (TextView) findViewById(R.id.first_sun);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("S")) {
                textView.setTextColor(Color.rgb(0, 153, 0));
                this.setFirstOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }
        if (this.isFirstOk() && !this.isSecondOk()) {
            TextView textView = (TextView) findViewById(R.id.second_sun);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("O")) {
                textView.setTextColor(Color.rgb(0, 153, 0));
                this.setSecondOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }
        if (this.isFirstOk() && this.isSecondOk() && !this.isThirdOk()) {
            TextView textView = (TextView) findViewById(R.id.third_sun);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("L")) {
                textView.setTextColor(Color.rgb(0, 153, 0));
                this.setThirdOk(true);
                Intent intent = new Intent(this, CongratulationsActivity.class);
                intent.putExtra(CongratulationsActivity.NEXT_KEY, FlowerActivity.class);
                startActivity(intent);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }
    }

    public boolean isFirstOk() {
        return firstOk;
    }

    public void setFirstOk(boolean firstOk) {
        this.firstOk = firstOk;
    }

    public boolean isSecondOk() {
        return secondOk;
    }

    public void setSecondOk(boolean secondOk) {
        this.secondOk = secondOk;
    }

    public boolean isThirdOk() {
        return thirdOk;
    }

    public void setThirdOk(boolean thirdOk) {
        this.thirdOk = thirdOk;
    }
}
