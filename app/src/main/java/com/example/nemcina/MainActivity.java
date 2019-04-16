package com.example.nemcina;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onText (View view){
        launchActivity();
    }
    public void launchActivity (){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
    public void onButton (View view){
        launchActivity2();
    }
    public void launchActivity2 (){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void onLogin (View view){
        launchActivity3();
    }
    public void launchActivity3 (){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

}
