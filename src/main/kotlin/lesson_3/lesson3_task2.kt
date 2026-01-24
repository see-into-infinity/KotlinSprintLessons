package org.example.lesson_3

fun main() {
    val girlName = "Татьяна"
    val girlMiddleName = "Сергеевна"
    var girlLastName = "Андреева"

    var girlAge = 20

    println("$girlLastName $girlName $girlMiddleName, $girlAge")

    girlAge = 22
    girlLastName = "Сидорова"

    println("$girlLastName $girlName $girlMiddleName, $girlAge")
}