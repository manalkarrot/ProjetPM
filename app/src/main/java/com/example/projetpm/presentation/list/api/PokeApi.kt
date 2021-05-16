package com.example.projetpm.presentation.list.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon")
    fun getPokemonList(): Call<PokemonResponse>
}




