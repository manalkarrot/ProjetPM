package com.example.projetpm.presentation.list.api

data class PokemonDetailResponse(
        val name: String,
        val types: List<PokemonSlot>
)

data class PokemonSlot(
        val slot: Int,
        val type: PokemonType
)

data class PokemonType(
        val name: String,
        val url: String
)