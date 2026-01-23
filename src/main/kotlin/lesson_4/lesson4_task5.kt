package org.example.lesson_4

import java.util.*


const val MIN_CREW_QUANTITY = 55
const val MAX_CREW_QUANTITY = 70
const val PROVISION_BOXES_QUANTITY = 50
fun main() {
    val scanner = Scanner(System.`in`)

    // Ввод данных с консоли
    println("Введите наличие повреждений корпуса (true - есть, false - нет):")
    val hasDamage = scanner.nextBoolean()

    println("Введите текущий состав экипажа:")
    val crewQuantity = scanner.nextInt()

    println("Введите количество ящиков с провизией на борту:")
    val provisionBoxes = scanner.nextInt()

    println("Введите благоприятность метеоусловий (true - благоприятные, false - неблагоприятные):")
    val isWeatherGood = scanner.nextBoolean()

    val canSail = (!hasDamage && crewQuantity >= MIN_CREW_QUANTITY && crewQuantity <= MAX_CREW_QUANTITY && provisionBoxes > PROVISION_BOXES_QUANTITY) ||
            (hasDamage && crewQuantity == MAX_CREW_QUANTITY && isWeatherGood && provisionBoxes >= PROVISION_BOXES_QUANTITY)

    println("Может ли корабль отправиться в плавание? $canSail")
}