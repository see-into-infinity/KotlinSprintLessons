package org.example.lesson_1

fun main() {
    val seconds : Short = 6480
    val sixtySeconds: Int = 60

    val minutes = seconds / sixtySeconds
    val hours = minutes / sixtySeconds
    val minutesLeft = minutes % sixtySeconds
    val secondsLeft = seconds % sixtySeconds

    println("%02d:%02d:%02d".format(hours, minutesLeft, secondsLeft))
}