package com.example.pokemon_unittest_compose.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pokemon_unittest_compose.data.model.Pokemon
import com.example.pokemon_unittest_compose.di.PokemonRepository
import com.example.pokemon_unittest_compose.util.Resource

class PokemonDetailsViewModel constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}