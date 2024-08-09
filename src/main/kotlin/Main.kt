package ru.netology

fun main() {

    var amount = 17500.0   // размер перевода
    val commission = amount / 100 * 0.75      // расчет комиссии
    val minimumCommission = 35.0   // минимальная комиссия

    if (commission > minimumCommission) println(commission) else println(minimumCommission)
}