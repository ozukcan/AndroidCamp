package com.example.kotlindersleri.collections

fun main() {
    //HashMap JSON veri modeline benzemektedir.
    //Shared Preferences,DataStore,UserDefault(Swift) benziyor
    val iller = HashMap<Int,String>()
    iller.put(1,"ADANA")
    iller[34] = "ISTANBUL"
    iller[6] = "ANKARA"
    println(iller)

    //GÜNCELLEME
    iller[16] = "YENI BURSA"
    println(iller)

    val il = iller[6]
    println(il)

    //Boyut
    println("Boyut : ${iller.size}")

    for ((anahtar,deger) in iller) {
        println("$anahtar -> $deger")
    }

    //Silme
    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)

}