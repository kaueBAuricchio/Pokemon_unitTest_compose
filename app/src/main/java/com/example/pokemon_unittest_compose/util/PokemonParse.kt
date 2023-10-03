package com.example.pokemon_unittest_compose.util

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.toLowerCase
import com.example.pokemon_unittest_compose.data.model.Stat
import com.example.pokemon_unittest_compose.data.model.Type
import com.example.pokemon_unittest_compose.ui.theme.AtkColor
import com.example.pokemon_unittest_compose.ui.theme.DefColor
import com.example.pokemon_unittest_compose.ui.theme.HPColor
import com.example.pokemon_unittest_compose.ui.theme.SpAtkColor
import com.example.pokemon_unittest_compose.ui.theme.SpDefColor
import com.example.pokemon_unittest_compose.ui.theme.SpdColor
import com.example.pokemon_unittest_compose.ui.theme.TypeBug
import com.example.pokemon_unittest_compose.ui.theme.TypeDark
import com.example.pokemon_unittest_compose.ui.theme.TypeDragon
import com.example.pokemon_unittest_compose.ui.theme.TypeElectric
import com.example.pokemon_unittest_compose.ui.theme.TypeFairy
import com.example.pokemon_unittest_compose.ui.theme.TypeFighting
import com.example.pokemon_unittest_compose.ui.theme.TypeFire
import com.example.pokemon_unittest_compose.ui.theme.TypeFlying
import com.example.pokemon_unittest_compose.ui.theme.TypeGhost
import com.example.pokemon_unittest_compose.ui.theme.TypeGrass
import com.example.pokemon_unittest_compose.ui.theme.TypeGround
import com.example.pokemon_unittest_compose.ui.theme.TypeIce
import com.example.pokemon_unittest_compose.ui.theme.TypeNormal
import com.example.pokemon_unittest_compose.ui.theme.TypePoison
import com.example.pokemon_unittest_compose.ui.theme.TypePsychic
import com.example.pokemon_unittest_compose.ui.theme.TypeRock
import com.example.pokemon_unittest_compose.ui.theme.TypeSteel
import com.example.pokemon_unittest_compose.ui.theme.TypeWater
import java.util.Locale

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "Ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "Steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}
fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.lowercase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.lowercase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""

    }
}