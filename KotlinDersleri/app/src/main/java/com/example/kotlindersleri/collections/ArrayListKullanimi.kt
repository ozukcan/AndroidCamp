package com.example.kotlindersleri.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()

    //Veri ekleme : en sonuna ekleme yapar
    meyveler.add("Elma")//ilk eklenen 0.index
    meyveler.add("Muz")
    meyveler.add("Mango")
    meyveler.add("Kiraz")
    println(meyveler)

    //Insert : istediğimiz bir indexe ekleme yapar
    meyveler.add(1,"Portakal")

    //Güncelleme
    meyveler[2] = "Yeni Muz"
    println(meyveler)

    //Okuma-Veri alma
    val m = meyveler[3]
    println(m)
    println(meyveler.get(3))

    //Reverse tersine çevirir, size meyvelerin "boyutu kadar" demektir.
    println("Boyut : ${meyveler.size}")
    meyveler.reverse()
    println(meyveler)

    for(meyve in meyveler) {
        println("Sonuç : $meyve")
    }

    //withIndex : indexlerle birlikte getirmek istersek kullanırız
    for((indeks,meyve) in meyveler.withIndex()) {
        println("$indeks --> $meyve")
    }

    //indexten eleman silme
    meyveler.removeAt(1)
    println(meyveler)

    //Tümünü silme
    meyveler.clear()
    println(meyveler)



}