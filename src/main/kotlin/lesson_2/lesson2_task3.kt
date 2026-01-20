package org.example.lesson_2

fun main() {
    var departureTimeHour: Int = 9
    var departureTimeMinute: Int = 39
    var routeTimeInMinutes: Int = 457
    val sixtySeconds: Int = 60
    val hoursInDay: Int = 24

    val totalMinutesFromStart = departureTimeHour * sixtySeconds + departureTimeMinute + routeTimeInMinutes
    val arrivalHour = (totalMinutesFromStart / sixtySeconds) % hoursInDay
    val arrivalMinute = totalMinutesFromStart % sixtySeconds

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}