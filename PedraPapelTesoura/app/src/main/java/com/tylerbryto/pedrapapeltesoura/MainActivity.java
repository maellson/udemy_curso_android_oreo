package com.tylerbryto.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }
    void opcaoSelecionada(String escolhaUsuario) {
        String[] opcoes = {
          "pedra",
          "papel",
          "tesoura"
        };
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];
        ImageView imageResultado = findViewById(R.id.imageResultado);
        switch (escolhaApp){
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
            default: break;
        }

        TextView textResultado = findViewById(R.id.textResultado);
        if (
                (escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
                (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
                (escolhaApp == "tesoura" && escolhaUsuario == "papel")
           ) { //app ganhou
            textResultado.setText("Você perdeu!");
        } else if ( //usuario ganhou
                (escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
                        (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
                        (escolhaUsuario == "tesoura" && escolhaApp == "papel")
                ) {
            textResultado.setText("Você ganhou!");
        } else { //empate
            textResultado.setText("Empatamos!");
        }
    }
}
