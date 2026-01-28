package org.example.lesson_5

const val INITIAL_NUMBER_IN_RANGE = 1
const val END_NUMBER_IN_RANGE = 10

fun main() {
    val firstRandomNumber = (INITIAL_NUMBER_IN_RANGE..END_NUMBER_IN_RANGE).random()
    val secondRandomNumber = (INITIAL_NUMBER_IN_RANGE..END_NUMBER_IN_RANGE).random()
    val correctNumber = firstRandomNumber + secondRandomNumber

    println("Решите задачу. Сколько будет $firstRandomNumber + $secondRandomNumber?")

    val userInputNumber = readln().toInt()

    if (userInputNumber == correctNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}