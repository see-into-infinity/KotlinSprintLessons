package org.example.lesson_2


fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    val buffFactor = 1.2

    val crystalOreWithBuff: Int = (crystalOre * buffFactor).toInt()
    val ironOreWithBuff: Int = (ironOre * buffFactor).toInt()

    val crystalOreBonus: Int  = crystalOreWithBuff - crystalOre
    val ironOreBonus: Int  = ironOreWithBuff - ironOre

    println("crystal ore bonus: $crystalOreBonus")
    println("iron ore bonus: $ironOreBonus")
}