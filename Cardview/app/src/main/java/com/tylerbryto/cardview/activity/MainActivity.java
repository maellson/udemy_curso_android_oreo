package com.tylerbryto.cardview.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.tylerbryto.cardview.R;
import com.tylerbryto.cardview.adapter.PostagemAdapter;
import com.tylerbryto.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.HORIZONTAL);

        recyclerPostagem.setLayoutManager(layoutManager);

        criarPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    private void criarPostagens() {
        postagens.add(new Postagem("Tyler Bryto", "Viagem legal", R.drawable.imagem1));
        postagens.add(new Postagem("Hotel Zytos", "Aproveite nossos descontos", R.drawable.imagem2));
        postagens.add(new Postagem("Maria Luiza", "#paris", R.drawable.imagem3));
        postagens.add(new Postagem(".123amanda", "Topzera", R.drawable.imagem4));
    }
}
