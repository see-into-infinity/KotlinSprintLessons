package org.example.lesson_4

import java.util.*


const val MIN_CREW_QUANTITY = 55
const val MAX_CREW_QUANTITY = 70
const val PROVISION_BOXES_QUANTITY = 50
fun main() {

    println("Введите наличие повреждений корпуса (true - есть, false - нет):")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crewQuantity = readln().toInt()

    println("Введите количество ящиков с провизией на борту:")
    val provisionBoxes = readln().toInt()

    println("Введите благоприятность метеоусловий (true - благоприятные, false - неблагоприятные):")
    val isWeatherGood = readln().toBoolean()

    val canSail =
        (!hasDamage && crewQuantity >= MIN_CREW_QUANTITY && crewQuantity <= MAX_CREW_QUANTITY && provisionBoxes > PROVISION_BOXES_QUANTITY) ||
                (hasDamage && crewQuantity == MAX_CREW_QUANTITY && isWeatherGood && provisionBoxes >= PROVISION_BOXES_QUANTITY)

    println("Может ли корабль отправиться в плавание? $canSail")
}