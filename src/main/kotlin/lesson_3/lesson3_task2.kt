package org.example.lesson_3

fun main() {
    val girlName = "Татьяна"
    val girlMiddleName = "Сергеевна"
    var girlLastName = "Андреева"

    val ageBeforeMarriage = 20
    val ageAfterMarriage = 22

    println("$girlLastName $girlName $girlMiddleName, $ageBeforeMarriage")

    girlLastName = "Сидорова"

    println("$girlLastName $girlName $girlMiddleName, $ageAfterMarriage")
}