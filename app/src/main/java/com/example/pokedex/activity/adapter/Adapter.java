package com.example.pokedex.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokedex.R;
import com.example.pokedex.activity.model.Pokemon;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {


    private List<Pokemon> listaPokemons;

    public Adapter(List<Pokemon> lista) {
        this.listaPokemons = lista;
    }


    //implementação dos métodos da classe RecyclerView.Adapter
    @NonNull
    @Override //cria a visualização
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //criação do objeto itemLista (do tipo View) que vai receber a xml onde está nossa recyclerView
        // convertemos a xml para o tipo view com LayoutInflater
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista_pokedex, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override //exibe os itens criados
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Pokemon pokemon = listaPokemons.get( position );
        holder.nomePokemon.setText(pokemon.getNomePokemon());
        holder.numPokemon.setText(pokemon.getNumeroPokemon());
        holder.tipoPokemon.setText(pokemon.getTipoPokemon());
        holder.imgPokemon.setImageResource(pokemon.getImagemPokemon());
    }

    @Override //define a quantidade de itens exibidos
    public int getItemCount() {
        return listaPokemons.size();
    }

    //classe viewHolder com o seu construtor
    public class MyViewHolder extends RecyclerView.ViewHolder {

        //declaração dos elementos que vão constituir nossa viewHolder

        TextView nomePokemon;
        TextView numPokemon;
        TextView tipoPokemon;
        ImageView imgPokemon;

        //construtor e recuperação dos elementos que vão ser configurados e apresentados na tela
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.nomePokemon = itemView.findViewById(R.id.textName);
            this.numPokemon = itemView.findViewById(R.id.textNumber);
            this.tipoPokemon = itemView.findViewById(R.id.textType);
            this.imgPokemon = itemView.findViewById(R.id.imagePokemon);
        }
    }
}
