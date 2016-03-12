package com.example.anapaula.comoseescreve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }

    public void goToStart(View view){
        Intent intent = new Intent(this, SunActivity.class);
        startActivity(intent);
    }
}
