package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val firstRandomNumber = Random.nextInt(1, 11)
    val secondRandomNumber = Random.nextInt(1, 11)
    val correctNumber = firstRandomNumber + secondRandomNumber

    println("Решите задачу. Сколько будет $firstRandomNumber + $secondRandomNumber?")

    val userInputNumber = readln().toInt()

    if (userInputNumber == correctNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}