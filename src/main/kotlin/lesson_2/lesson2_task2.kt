package org.example.lesson_2


fun main() {
    var workersQuantity: Int= 50
    var workerSalary: Int = 30000

    var internsQuantity: Int = 30
    var internSalary: Int = 20000

    var allWorkersSalary: Int = workersQuantity * workerSalary
    println(allWorkersSalary)

    var allInternsSalary: Int = internsQuantity * internSalary

    var allEmployeesSalary: Int = allWorkersSalary + allInternsSalary
    println(allEmployeesSalary)

    var averageEmployeeSalary: Int = allEmployeesSalary / (workersQuantity + internsQuantity)
    println(averageEmployeeSalary)
}