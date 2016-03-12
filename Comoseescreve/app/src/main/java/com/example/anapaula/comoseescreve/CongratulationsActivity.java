package com.example.anapaula.comoseescreve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CongratulationsActivity extends AppCompatActivity {

    public static final String NEXT_KEY = "comoseescreve.NEXT";
    private Class nextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);
        nextActivity = (Class) getIntent().getSerializableExtra(NEXT_KEY);
    }

    public void goToNext(View view){
        Intent intent = new Intent(this, nextActivity);
        startActivity(intent);
    }
}
