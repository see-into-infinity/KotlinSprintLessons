package org.example.lesson_5


const val FIRST_WINNING_NUMBER = 7
const val SECOND_WINNING_NUMBER = 21
const val INITIAL_NUMBER_IN_RANGE = 0
const val END_NUMBER_IN_RANGE = 42
fun main() {

    println("Введите первое число от $INITIAL_NUMBER_IN_RANGE до $END_NUMBER_IN_RANGE:")
    val userFirstInputNumber = readln().toInt()

    println("Введите второе число от $INITIAL_NUMBER_IN_RANGE до $END_NUMBER_IN_RANGE:")
    val userSecondInputNumber = readln().toInt()

    println("Правильные числа для победы: $FIRST_WINNING_NUMBER и $SECOND_WINNING_NUMBER")

    val userNumbers = setOf(userFirstInputNumber, userSecondInputNumber)
    val winningNumbers = setOf(FIRST_WINNING_NUMBER, SECOND_WINNING_NUMBER)

    val countCorrectNumbers = userNumbers.intersect(winningNumbers).size

    when (countCorrectNumbers) {
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        0 -> println("Неудача!")
    }
}