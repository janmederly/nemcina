package com.example.nemcina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class Main4Activity extends AppCompatActivity {
    public String slovicko = "Auto";
    public String odpoved = "Auto";
    public int ktore;
    public int spravneUrcene = 0;
    public String[] slovicka = new String[100];
    public String[] odpovede = new String[100];
    public int kolko = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button vyhodnot = (Button) findViewById(R.id.hotovo);
        TextView slovencina = (TextView)findViewById(R.id.slovicko);
        slovencina.setText(slovicko);
        Random rand = new Random();
        ktore = rand.nextInt(4);
        TextView pocetSpravnych = (TextView)findViewById(R.id.textView2);
        pocetSpravnych.setText(Integer.toString(spravneUrcene));
        slovicka[0] = "auto";
        slovicka[1] = "dobre";
        slovicka[2] = "plavat";
        slovicka[3] = "papier";
        slovicka[4] = "kos";
        odpovede[0] = "das Auto";
        odpovede[1] = "gut";
        odpovede[2] = "schwimmen";
        odpovede[3] = "das Papier";
        odpovede[4] = "das Papierkorb";

    }
    public void onNext(View view){


        Random rand = new Random();
        int slovo = rand.nextInt(kolko);
        slovicko = slovicka[slovo];
        odpoved = odpovede[slovo];

        TextView slovencina = (TextView)findViewById(R.id.slovicko);
        slovencina.setText(slovicko);
    }

    public void onVyhodnot(View view) {

        Log.i("Info log", "click");
        EditText nemcina = (EditText)findViewById(R.id.odpoved);
        String slovo = nemcina.getText().toString();
        TextView slovencina = (TextView)findViewById(R.id.slovicko);
        if (slovo.equals(odpoved)) {
            Log.i("Info log", "if");
            slovencina.setText("Spravne");
            spravneUrcene++;
        }else{
            slovencina.setText("Nespravne");
            spravneUrcene = 0;
        }
        TextView pocetSpravnych = (TextView)findViewById(R.id.textView2);
        pocetSpravnych.setText(Integer.toString(spravneUrcene));
    }

    public void onSJLNEJ (View view){
        String[] slovicka1 = new String[100];
        String[] odpovede1 = new String[100];
        for (int i = 0;i <= kolko;i++){

            odpovede1[i] = slovicka[i];
            slovicka1[i] = odpovede[i];
            odpovede[i] = odpovede1[i];
            slovicka[i] = slovicka1[i];
        }
    }
    public void onBack (View view){
        launchActivity2();
    }
    public void  launchActivity2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
