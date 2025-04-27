package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val y1 = Yemekler(100, "Kofte", 249.90)
    //Değer okuma
    y1.bilgiAl()
    //Değer atama
    y1.fiyat = 350.0
    y1.bilgiAl()


    val y2 = Yemekler(200, "Baklava", 300.0)
    y2.bilgiAl()
    y2.ad = "Soguk baklava"
    y2.bilgiAl()


}