package com.example.projetpm.presentation.list.api

import com.example.projetpm.presentation.list.Pokemon


data class PokemonResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)