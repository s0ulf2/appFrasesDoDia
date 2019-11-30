package com.example.appfrases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView novaFrase;
    private Button ativar;
    private String[] frases = { "Frase de teste","Frase numero dois","Frase numero tres" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ativar = (Button) findViewById(R.id.ID_BUTTON);
       novaFrase = (TextView) findViewById(R.id.ID_FRASE);


        ativar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numero = randomico.nextInt(3);


               novaFrase.setText(frases[numero]);
            }
        });






    }
}
