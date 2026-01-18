package org.example.lesson_1

fun main() {
    val seconds : Short = 6480

    val minutes = seconds / 60
    val hours = minutes / 60
    val minutesLeft = minutes % 60
    val secondsLeft = seconds % 60

    println("%02d:%02d:%02d".format(hours, minutesLeft, secondsLeft))
}