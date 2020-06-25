package com.example.pokedex.activity.model;

public class Pokemon {

    //características dos pokemons
    private String nomePokemon;
    private String numeroPokemon;
    private String tipoPokemon;
    private int imagemPokemon;

    public Pokemon(){

    }


    public Pokemon(String nomePokemon,
                   String numeroPokemon,
                   String tipoPokemon,
                   int imagemPokemon) {

        this.nomePokemon = nomePokemon;
        this.numeroPokemon = numeroPokemon;
        this.tipoPokemon = tipoPokemon;
        this.imagemPokemon = imagemPokemon;
    }

    public String getNomePokemon() {
        return nomePokemon;
    }

    public void setNomePokemon(String nomePokemon) {
        this.nomePokemon = nomePokemon;
    }

    public String getNumeroPokemon() {
        return numeroPokemon;
    }

    public void setNumeroPokemon(String numeroPokemon) {
        this.numeroPokemon = numeroPokemon;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public int getImagemPokemon() {
        return imagemPokemon;
    }

    public void setImagemPokemon(int imagemPokemon) {
        this.imagemPokemon = imagemPokemon;
    }
}
