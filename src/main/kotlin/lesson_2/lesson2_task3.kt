package org.example.lesson_2

const val SIXTY_SECONDS = 60

fun main() {
    var departureTimeHour: Int = 9
    var departureTimeMinute: Int = 39
    var routeTimeInMinutes: Int = 457
    val hoursInDay: Int = 24

    val totalMinutesFromStart = departureTimeHour * SIXTY_SECONDS + departureTimeMinute + routeTimeInMinutes
    val arrivalHour = (totalMinutesFromStart / SIXTY_SECONDS) % hoursInDay
    val arrivalMinute = totalMinutesFromStart % SIXTY_SECONDS

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}