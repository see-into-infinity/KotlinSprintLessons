package org.example.lesson_4

const val IS_SUNNY_WEATHER = true
const val IS_TENT_OPENED = true
const val REQUIRED_HUMIDITY = 20
const val FORBIDDEN_SEASON = "зима"

fun main() {
    val isCurrentWeatherSunny: Boolean = true
    val isCurrentTentOpen: Boolean = true
    val currentHumidity: Int = 20
    val currentSeason: String = "зима"

    val isFavorableConditions =
            isCurrentWeatherSunny == IS_SUNNY_WEATHER &&
            isCurrentTentOpen == IS_TENT_OPENED &&
            currentHumidity == REQUIRED_HUMIDITY &&
            currentSeason != FORBIDDEN_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}