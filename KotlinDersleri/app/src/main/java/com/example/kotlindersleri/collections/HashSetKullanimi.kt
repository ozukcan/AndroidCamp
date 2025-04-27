package com.example.kotlindersleri.collections

fun main() {
    //HashSET
    //Tanımlama
    val meyveler = HashSet<String>()
    //String yerine Any yazmak --> Any en üst sınıf demektir ve bütün türleri kapsar.

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    meyveler.add("Mango")
    meyveler.add("Erik")
    meyveler.add("Karpuz")
    println(meyveler)

    meyveler.add("Kavun")
    println(meyveler)

    val y = meyveler.elementAt(2)
    println(y)
    println("Boyut : ${meyveler.size}")

    for(meyve in meyveler) {
        println("Sonuç : $meyve")
    }

    //withIndex : indexlerle birlikte getirmek istersek kullanırız
    for((indeks,meyve) in meyveler.withIndex()) {
        println("$indeks --> $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
}