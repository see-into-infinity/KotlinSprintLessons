package org.example.lesson_2

fun main() {
    var departureTimeHour: Int = 9
    var departureTimeMinute: Int = 39
    var routeTimeInMinutes: Int = 457

    val totalMinutesFromStart = departureTimeHour * 60 + departureTimeMinute + routeTimeInMinutes
    val arrivalHour = (totalMinutesFromStart / 60) % 24
    val arrivalMinute = totalMinutesFromStart % 60

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}