package com.example.pokedex.activity.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokedex.R;
import com.example.pokedex.activity.adapter.Adapter;
import com.example.pokedex.activity.data.Data;
import com.example.pokedex.activity.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokedexActivity extends AppCompatActivity {

    //criação do objeto recyclerView
    private RecyclerView recyclerView;
    private Adapter adapter;
    private Button botaoFechar;



    //criando o array que vai armazenar as informações dos pokemons
    private List<Pokemon> listaPokemons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);

        botaoFechar = findViewById(R.id.buttonExite);
        botaoFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        //referenciando meu objeto com o recyclerview do layout (lista_pokedex)
        recyclerView = findViewById(R.id.recyclerView);

        //instanciado nosso objeto adapter e executando a classe que preenche a pokedex
        adapter = new Adapter( listaPokemons );
        this.criarPokedex();

        //criando e configurando o gerenciador de layout que vai exibir minha lista
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    //lista dos pokemons
    public void criarPokedex() {


        Data data = new Data();

        for (int i = 0; i<data.nome.length; i++){

            String nome = data.nome[i];
            int foto = data.foto[i];
            String tipo = data.tipo[i];

            String numero = String.valueOf(i+1);
            Pokemon lista = new Pokemon(nome,"Nº "+numero, tipo, foto);
            this.listaPokemons.add( lista );
        }

    }

    public void voltarHome (View view){

        finish();
    }
}