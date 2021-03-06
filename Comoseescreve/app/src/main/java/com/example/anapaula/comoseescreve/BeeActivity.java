package com.example.anapaula.comoseescreve;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BeeActivity extends AppCompatActivity {

    private boolean firstOk;
    private boolean secondOk;
    private boolean thirdOk;
    private boolean fourthOk;
    private boolean fifthOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bee);
        this.firstOk = false;
        this.secondOk = false;
        this.thirdOk = false;
        this.fourthOk = false;
        this.fifthOk = false;
    }

    public void putFirst(View view) {
        if (!this.isFirstOk()) {
            TextView textView = (TextView) findViewById(R.id.first_bee);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("A")) {
                textView.setTextColor(Color.rgb(0, 153, 0));
                this.setFirstOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }
        if(this.isFirstOk() && !this.isSecondOk()){
            TextView textView = (TextView) findViewById(R.id.second_bee);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("B")) {
                textView.setTextColor(Color.rgb(0,153,0));
                this.setSecondOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }
        if(this.isFirstOk() && this.isSecondOk() && !this.isThirdOk()){
            TextView textView = (TextView) findViewById(R.id.third_bee);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("E")) {
                textView.setTextColor(Color.rgb(0,153,0));
                this.setThirdOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }
        if(this.isFirstOk() && this.isSecondOk() && this.isThirdOk() && !this.isFourthOk()){
            TextView textView = (TextView) findViewById(R.id.fourth_bee);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("L")) {
                textView.setTextColor(Color.rgb(0,153,0));
                this.setFourthOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }

        if(this.isFirstOk() && this.isSecondOk() && this.isThirdOk() && this.isFourthOk() && !this.isFifthOk()){
            TextView textView = (TextView) findViewById(R.id.fifth_bee);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("H")) {
                textView.setTextColor(Color.rgb(0,153,0));
                this.setFifthOk(true);
                return;
            }
            textView.setTextColor(Color.rgb(179, 4, 4));
        }

        if(this.isFirstOk() && this.isSecondOk() && this.isThirdOk() && this.isFourthOk() && this.isFifthOk()){
            TextView textView = (TextView) findViewById(R.id.sixth_bee);
            textView.setText(view.getTag().toString());
            if (view.getTag().toString().equals("A")) {
                textView.setTextColor(Color.rgb(0, 153, 0));
                Intent intent = new Intent(this, FinalActivity.class);
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

    public boolean isFourthOk() {
        return fourthOk;
    }

    public void setFourthOk(boolean fourthOk) {
        this.fourthOk = fourthOk;
    }

    public boolean isFifthOk() {
        return fifthOk;
    }

    public void setFifthOk(boolean fifthOk) {
        this.fifthOk = fifthOk;
    }
}
