package org.example.lesson_5


const val FIRST_WINNING_NUMBER = 7
const val SECOND_WINNING_NUMBER = 21
fun main() {

    println("Введите первое число от 0 до 42:")
    val userFirstInputNumber = readln().toInt()

    println("Введите второе число от 0 до 42:")
    val userSecondInputNumber = readln().toInt()

    println("Правильные числа для победы: $FIRST_WINNING_NUMBER и $SECOND_WINNING_NUMBER")

    var countCorrectNumbers = 0
    if (FIRST_WINNING_NUMBER == userFirstInputNumber || SECOND_WINNING_NUMBER == userFirstInputNumber) {
        countCorrectNumbers++
    }
    if (SECOND_WINNING_NUMBER == userSecondInputNumber || FIRST_WINNING_NUMBER == userSecondInputNumber) {
        countCorrectNumbers++
    }
    when (countCorrectNumbers) {
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        0 -> println("Неудача!")
    }
}