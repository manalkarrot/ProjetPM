package com.example.projetpm.presentation.list.api

import com.example.projetpm.presentation.liste.Pokemon


data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)