package org.example.lesson_4

fun main() {

    val trainingDay = 5

    val isArmDay = trainingDay % 2 != 0
    val isArmExercise = isArmDay
    val isLegExercise = !isArmDay
    val isBackExercise = !isArmDay
    val isAbsExercise = isArmDay


    println(
                "Упражнения для рук:       $isArmExercise\n" +
                "Упражнения для ног:       $isLegExercise\n" +
                "Упражнения для спины:     $isBackExercise\n" +
                "Упражнения для пресса:    $isAbsExercise"
    )
}