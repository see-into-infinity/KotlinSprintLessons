package org.example.lesson_4

const val ALL_TABLES = 13
fun main() {

    val bookedToday = 13
    val bookedTomorrow = 9

    val availableToday = bookedToday < ALL_TABLES
    val availableTomorrow = bookedTomorrow < ALL_TABLES

    println("[Доступность столиков на сегодня: $availableToday],")
    println("[Доступность столиков на завтра: $availableTomorrow].")
}