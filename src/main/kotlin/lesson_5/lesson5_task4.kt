package org.example.lesson_5

const val REGISTERED_USER_NAME = "Zaphod"
const val REGISTERED_USER_PASSWORD = "PanGalactic"

fun main() {
    println("Робот: \"Приветствовую вас на борту корабля \"Heart of Gold\".")
    println("Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа:")

    val userNameInput = readln()
    if (userNameInput == REGISTERED_USER_NAME) {
        println("Ввведите пароль:")
        val userPasswordInput = readln()
        if(userPasswordInput == REGISTERED_USER_PASSWORD) {
           println("Ваши данные проверены, и о, чудо, они верны...")
        }
    } else {
        println("Вам нужно зарегестрироваться.")
    }

}