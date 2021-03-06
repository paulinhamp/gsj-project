package com.example.anapaula.comoseescreve;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FlowerActivity extends AppCompatActivity {

    private boolean firstOk;
    private boolean secondOk;
    private boolean thirdOk;
    private boolean fourthOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);
        this.firstOk = false;
        this.secondOk = false;
        this.thirdOk = false;
        this.fourthOk = false;
    }

    public void putFirst(View view) {
        if (!this.isFirstOk()) {
            TextView textView = (TextView) findViewById(R.id.first_flower);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("F")) {
                textView.setTextColor(Color.rgb(0,153,0));
                this.setFirstOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }
        if(this.isFirstOk() && !this.isSecondOk()){
            TextView textView = (TextView) findViewById(R.id.second_flower);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("L")) {
                textView.setTextColor(Color.rgb(0,153,0));
                this.setSecondOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }
        if(this.isFirstOk() && this.isSecondOk() && !this.isThirdOk()){
            TextView textView = (TextView) findViewById(R.id.third_flower);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("O")) {
                textView.setTextColor(Color.rgb(0,153,0));
                this.setThirdOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }
        if(this.isFirstOk() && this.isSecondOk() && this.isThirdOk() && !this.isFourthOk()){
            TextView textView = (TextView) findViewById(R.id.fourth_flower);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("R")) {
                textView.setTextColor(Color.rgb(0, 153, 0));
                Intent intent = new Intent(this, CongratulationsActivity.class);
                intent.putExtra(CongratulationsActivity.NEXT_KEY, BallActivity.class);
                startActivity(intent);
                this.setFourthOk(true);
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

    public boolean isFourthOk() {
        return fourthOk;
    }

    public void setFourthOk(boolean fourthOk) {
        this.fourthOk = fourthOk;
    }
}
