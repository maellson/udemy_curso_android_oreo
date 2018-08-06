package com.tylerbryto.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.textResultado);


    }

    public void calcularPreco(View view) {
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        if(validarCampos(precoAlcool, precoGasolina)) {
            calcularMelhorPreco(precoAlcool, precoGasolina);
        } else {
            textResultado.setText("Preencha os preços primeiro!");
        }

    }

    public boolean validarCampos(String precoAlcool, String precoGasolina){
        if (precoAlcool.isEmpty() || precoGasolina.isEmpty())
            return false;
        return true;
    }

    public void calcularMelhorPreco(String pAlcool, String pGasolina) {
        Double precoAlcool = Double.parseDouble(pAlcool);
        Double precoGasolina = Double.parseDouble(pGasolina);
        if (precoAlcool / precoGasolina >= 0.7)
            textResultado.setText("É melhor utilizar Gasolina!");
        else
            textResultado.setText("É melhor utilizar Alcool!");
    }
}
