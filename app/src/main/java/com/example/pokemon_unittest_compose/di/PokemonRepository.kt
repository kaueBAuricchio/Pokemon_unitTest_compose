package com.example.pokemon_unittest_compose.di

import androidx.lifecycle.ViewModel
import com.example.pokemon_unittest_compose.data.PokeApi
import com.example.pokemon_unittest_compose.data.model.Pokemon
import com.example.pokemon_unittest_compose.data.model.PokemonList
import com.example.pokemon_unittest_compose.util.Resource

class PokemonRepository constructor(
    private val apiService: PokeApi
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            apiService.getPokemonList(limit = limit, offset = offset)
        } catch (e: Exception) {
            return Resource.Error("Ocorreu um erro inesperado")
        }

        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(name: String): Resource<Pokemon> {
        val response = try {
            apiService.getPokemonInfo(name = name)
        } catch (e: Exception) {
            return Resource.Error("Ocorreu um erro inesperado.")
        }

        return Resource.Success(response)
    }
}