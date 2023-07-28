package com.example.svaraandroidtest.Retrofit;


import io.reactivex.Observable;

import com.example.svaraandroidtest.Model.Pokedex;

import retrofit2.http.GET;

public interface IPokemonDex {
    @GET("pokedex.json")
    Observable <Pokedex> getListPokemon();

}
