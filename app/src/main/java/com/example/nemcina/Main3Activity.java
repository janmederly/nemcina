package com.example.nemcina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onBack (View view){
        launchActivity2();
    }
    public void  launchActivity2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
