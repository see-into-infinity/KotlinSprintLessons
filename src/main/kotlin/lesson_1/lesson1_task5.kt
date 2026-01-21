package org.example.lesson_1

const val SIXTY_SECONDS = 60

fun main() {
    val seconds : Short = 6480

    val minutes = seconds / SIXTY_SECONDS
    val hours = minutes / SIXTY_SECONDS
    val minutesLeft = minutes % SIXTY_SECONDS
    val secondsLeft = seconds % SIXTY_SECONDS

    println("%02d:%02d:%02d".format(hours, minutesLeft, secondsLeft))
}