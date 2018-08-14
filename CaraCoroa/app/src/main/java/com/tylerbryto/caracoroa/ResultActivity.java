package com.tylerbryto.caracoroa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {
    private ImageView imageResult;
    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        buttonBack = findViewById(R.id.buttonBack);
        imageResult = findViewById(R.id.imageResult);

        Bundle data = getIntent().getExtras();
        int numero = data.getInt("numero");

        imageResult.setImageResource(numero == 0 ?
                R.drawable.moeda_cara :
                R.drawable.moeda_coroa);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
