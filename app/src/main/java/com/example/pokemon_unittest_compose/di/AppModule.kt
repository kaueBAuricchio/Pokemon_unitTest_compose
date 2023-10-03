package com.example.pokemon_unittest_compose.di

import com.example.pokemon_unittest_compose.data.PokeApi
import com.example.pokemon_unittest_compose.util.Constants.BASE_URL
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

val AppModule = module {

    single { providerPokemonRepository(get()) }
    single { providerPokeApi() }

}

fun providerPokemonRepository(api: PokeApi) = PokemonRepository(api)

fun providerPokeApi(): PokeApi {
    return Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
        .create(PokeApi::class.java)
}
