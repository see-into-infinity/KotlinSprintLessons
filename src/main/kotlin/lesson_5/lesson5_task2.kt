package org.example.lesson_5

import java.time.LocalDate

const val LEGAL_AGE = 18
fun main() {
    println("Введите год вашего рождения:")
    val userBirthYear = readln().toInt()
    val currentYear = LocalDate.now().year

    val resultText = if (currentYear - userBirthYear >= LEGAL_AGE) {
        "Показать экран со скрытым контентом"
    } else {
        "Back to main screen"
    }
    println(resultText)
}