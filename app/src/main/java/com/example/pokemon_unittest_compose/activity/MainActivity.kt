package com.example.pokemon_unittest_compose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.pokemon_unittest_compose.ui.theme.Pokemon_unitTest_composeTheme
import com.example.pokemon_unittest_compose.viewmodel.PokemonListViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pokemon_unitTest_composeTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "pokemon_list_screen"
                ) {
                    composable(route = "pokemon_list_screen") {
                            PokemonListScreen(
                                navController = navController
                            )
                    }
                    composable(
                        route = "pokemon_detail_screen/{dominantColor}/{pokemonName}",
                        arguments = listOf(
                            navArgument(name = "dominantColor") {
                                type = NavType.IntType
                            },
                            navArgument(name = "pokemonName") {
                                type = NavType.StringType
                            }
                        )
                    ) {
                        val dominantColor = remember {
                            val  color = it.arguments?.getInt("dominantColor")
                            color?.let { Color(it) } ?: Color.White
                        }
                        val pokemonName = remember {
                            it.arguments?.getString("pokemonName")

                        }
                        PokemonDetailsScreen(
                            dominantColor = dominantColor,
                            pokemonName = pokemonName ?: "",
                            navController = navController
                        )
                    }

                }
            }
        }
    }
}
