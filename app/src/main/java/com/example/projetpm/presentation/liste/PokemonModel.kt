package com.example.projetpm.presentation.liste


sealed class PokemonModel

data class PokemonSuccess(val pokeList: List<Pokemon>) : PokemonModel()
object PokemonLoader : PokemonModel()
object PokemonError : PokemonModel()
