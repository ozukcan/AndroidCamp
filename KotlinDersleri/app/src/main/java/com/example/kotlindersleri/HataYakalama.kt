package com.example.kotlindersleri

fun main() {
    //1 -> Compile Error : Kodlama yaparken oluşur
    //val sayi = 100
    //sayi = 500

    //2 -> Runtime Error (Exceptions)
    val x = 10
    val y = 0


    try {
        println("Sonuç : ${x/y}")
        println("İşlem tamamlandı")
    } catch (e:Exception) {
        println("İkinci sayı 0 olamaz")
    }

}