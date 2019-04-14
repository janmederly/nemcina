package com.example.nemcina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public String slovicko = "Auto";
    public String odpoved = "Auto";
    public int ktore;
    public int spravneUrcene = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button vyhodnot = (Button) findViewById(R.id.hotovo);
        TextView slovencina = (TextView)findViewById(R.id.slovicko);
        slovencina.setText(slovicko);
        Random rand = new Random();
        ktore = rand.nextInt(4);
        TextView pocetSpravnych = (TextView)findViewById(R.id.textView2);
        pocetSpravnych.setText(Integer.toString(spravneUrcene));

    }
    public void onNext(View view){

        String[] slovicka = new String[100];
        String[] odpovede = new String[100];
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
        Random rand = new Random();
        int slovo = rand.nextInt(5);
        slovicko = slovicka[slovo];
        odpoved = odpovede[slovo];
        ktore = rand.nextInt(4);
        int a = rand.nextInt(5);
        while (a == slovo){
            a = rand.nextInt(5);
        }
        int b = rand.nextInt(5);
        while (b == a || b == slovo){
            b = rand.nextInt(5);
        }
        int c = rand.nextInt(5);
        while (c == b || c == a || c == slovo){
            c = rand.nextInt(5);
        }
        int d = rand.nextInt(5);
        while (d == a || d == b || d == c || d == slovo) {
            d = rand.nextInt(5);
        }
        if (ktore == 0){
            ((Button) findViewById(R.id.answerA)).setText(odpovede[slovo]);
            ((Button) findViewById(R.id.answerB)).setText(odpovede[b]);
            ((Button) findViewById(R.id.answerC)).setText(odpovede[c]);
            ((Button) findViewById(R.id.answerD)).setText(odpovede[d]);
        }else if (ktore == 1){
            ((Button) findViewById(R.id.answerA)).setText(odpovede[a]);
            ((Button) findViewById(R.id.answerB)).setText(odpovede[slovo]);
            ((Button) findViewById(R.id.answerC)).setText(odpovede[c]);
            ((Button) findViewById(R.id.answerD)).setText(odpovede[d]);
        }else if (ktore == 2){
            ((Button) findViewById(R.id.answerA)).setText(odpovede[a]);
            ((Button) findViewById(R.id.answerB)).setText(odpovede[b]);
            ((Button) findViewById(R.id.answerC)).setText(odpovede[slovo]);
            ((Button) findViewById(R.id.answerD)).setText(odpovede[d]);
        }else if (ktore == 3) {
            ((Button) findViewById(R.id.answerA)).setText(odpovede[a]);
            ((Button) findViewById(R.id.answerB)).setText(odpovede[b]);
            ((Button) findViewById(R.id.answerC)).setText(odpovede[c]);
            ((Button) findViewById(R.id.answerD)).setText(odpovede[slovo]);
        }
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
    }
    public void onA (View view){
        if (ktore == 0) {
            TextView slovencina = (TextView) findViewById(R.id.slovicko);
            slovencina.setText("Spravne");
            spravneUrcene++;
        }else{
            TextView slovencina = (TextView)findViewById(R.id.slovicko);
            slovencina.setText("Nespravne");
            spravneUrcene = 0;
        }
        TextView pocetSpravnych = (TextView)findViewById(R.id.textView2);
        pocetSpravnych.setText(Integer.toString(spravneUrcene));
    }
    public void onB (View view){
        if (ktore == 1) {
            TextView slovencina = (TextView) findViewById(R.id.slovicko);
            slovencina.setText("Spravne");
            spravneUrcene++;
        }else{
            TextView slovencina = (TextView)findViewById(R.id.slovicko);
            slovencina.setText("Nespravne");
            spravneUrcene = 0;
        }
        TextView pocetSpravnych = (TextView)findViewById(R.id.textView2);
        pocetSpravnych.setText(Integer.toString(spravneUrcene));
    }
    public void onC (View view){
        if (ktore == 2) {
            TextView slovencina = (TextView) findViewById(R.id.slovicko);
            slovencina.setText("Spravne");
            spravneUrcene++;
        }else{
            TextView slovencina = (TextView)findViewById(R.id.slovicko);
            slovencina.setText("Nespravne");
            spravneUrcene = 0;
        }
        TextView pocetSpravnych = (TextView)findViewById(R.id.textView2);
        pocetSpravnych.setText(Integer.toString(spravneUrcene));
    }
    public void onD (View view){
        if (ktore == 3) {
            TextView slovencina = (TextView) findViewById(R.id.slovicko);
            slovencina.setText("Spravne");
            spravneUrcene++;
        }else{
            TextView slovencina = (TextView)findViewById(R.id.slovicko);
            slovencina.setText("Nespravne");
            spravneUrcene = 0;
        }
        TextView pocetSpravnych = (TextView)findViewById(R.id.textView2);
        pocetSpravnych.setText(Integer.toString(spravneUrcene));
    }
}
