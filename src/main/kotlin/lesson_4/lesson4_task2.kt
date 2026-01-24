package org.example.lesson_4

const val MIN_GOOD_WEIGHT = 35 
const val MAX_GOOD_WEIGHT = 100
const val MAX_GOOD_VOLUME = 100
fun main() {

    val weight1 = 20
    val volume1 = 80

    val weight2 = 50
    val volume2 = 100

    println("Груз с весом ${weight1} кг и объемом ${volume1} л соответствует категории 'Average': ${weight1 > MIN_GOOD_WEIGHT && weight1 <= MAX_GOOD_WEIGHT && volume1 < MAX_GOOD_VOLUME}")
    println("Груз с весом ${weight2} кг и объемом ${volume2} л соответствует категории 'Average': ${weight2 > MIN_GOOD_WEIGHT && weight2 <= MAX_GOOD_WEIGHT && volume2 < MAX_GOOD_VOLUME}")
}