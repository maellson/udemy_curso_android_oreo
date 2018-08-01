package com.tylerbryto.frasesdodia;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
                "Toda semana uma nova framework em JS",
                "Tão blz, tu ta certo, eu to errado",
                "Eu vou ligar meu paredão que é pra galera curtir",
                "Que bonito bolo"
        };
        String frase = frases[new Random().nextInt(frases.length)];
        TextView textResultado = findViewById(R.id.text_resultado);
        textResultado.setText(frase);
    }

}
