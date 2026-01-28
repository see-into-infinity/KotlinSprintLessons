package org.example.lesson_5

const val INITIAL_NUMBER_IN_RANGE = 0
const val END_NUMBER_IN_RANGE = 42
fun main() {
    println("Угадайте три числа от $INITIAL_NUMBER_IN_RANGE до $END_NUMBER_IN_RANGE!")
    val winningNumbers = (INITIAL_NUMBER_IN_RANGE..END_NUMBER_IN_RANGE).shuffled().take(3).sorted()

    println("Введите первое число:")
    val userFirstNumberInput = readln().toInt()

    println("Введите второе число:")
    val userSecondNumberInput = readln().toInt()

    println("Введите третье число:")
    val userThirdNumberInput = readln().toInt()

    val userNumbersList = listOf(userFirstNumberInput, userSecondNumberInput, userThirdNumberInput)

    val listOfMatchedNumbers = userNumbersList.intersect(winningNumbers)

    val matchedNumbersQuantity = listOfMatchedNumbers.size

    when (matchedNumbersQuantity) {
        3 -> println("Вы угадали все числа и выиграли джекпот")
        2 -> println("Вы угадали два числа и выиграли крупный приз")
        1 -> println("Вы угадали одно число и выиграли утишительный приз")
        0 -> println("Вы не угадали ни одного числа")
    }
    println("Выигрышные числа: $winningNumbers")
}