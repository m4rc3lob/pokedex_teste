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
import com.example.pokedex.activity.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokedexActivity extends AppCompatActivity {

    //criação do objeto recyclerView
    private RecyclerView recyclerView;

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
        Adapter adapter = new Adapter( listaPokemons );
        this.criarPokedex();

        //criando e configurando o gerenciador de layout que vai exibir minha lista
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    //lista dos pokemons
    public void criarPokedex(){

        Pokemon pokemon = new Pokemon("Bulbasaur","001", "Grama", R.drawable.bulbasaur);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Ivysaur","002", "Grama", R.drawable.ivysaur);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Venusaur","003", "Grama", R.drawable.venusaur);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Charmander","004", "Fogo", R.drawable.charmander);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Charmeleon","005", "Fogo", R.drawable.charmeleon);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Charizard","006", "Fogo", R.drawable.charizard);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Squirtle","007", "Água", R.drawable.squirtle);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Wartortle","008", "Água", R.drawable.wartortle);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Blastoise","009", "Água", R.drawable.blastoise);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Caterpie","010", "Inseto", R.drawable.caterpie);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Metapod","011", "Inseto", R.drawable.metapod);
        this.listaPokemons.add( pokemon );

        pokemon = new Pokemon("Butterfree","012", "Inseto, Voador", R.drawable.butterfree);
        this.listaPokemons.add( pokemon );

        String[] dadosPokemon = {
                "Bulbasaur",
                "Ivysaur",
                "Venusaur",
                "Charmander",
                "Charmeleon",
                "Charizard",
                "Squirtle",
                "Wartortle",
                "Blastoise",
                "Caterpie",
                "Metapod",
                "Butterfree"
                };
    }

    public void voltarHome (View view){

        finish();
    }
}