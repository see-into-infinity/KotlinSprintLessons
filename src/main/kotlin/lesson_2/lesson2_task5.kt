package org.example.lesson_2

fun main() {
    val clientDeposit = 70_000
    val interestRate = 16.7
    val depositPeriodYears = 20

    val rateDecimal = interestRate / 100.0

    val finalAmount = clientDeposit * Math.pow(1 + rateDecimal, depositPeriodYears.toDouble())
    println(finalAmount)
}