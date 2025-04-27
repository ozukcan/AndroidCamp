package com.example.kotlindersleri.degiskenler

fun main() {
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum = true

    println("id : $id")
    println("Ad : $ad")
    println("Resim : $resim")
    println("Puan : $puan")
    println("Fiyat : $fiyat")
    println("Stok Durum : $stokDurum")

    //Sabitler - Constant
    var sayi = 30
    sayi = 100

    //val sonradan değiştirmeyeceğimiz sabitlerde kullanılır.
    val numara = 50
    println(numara)

    //Tür Dönüşümü
    //1 - Sayısaldan sayısala dönüşüm

    val d = 89.56
    val i = 34
    val sonuc1 = d.toInt()
    val sonuc2 = i.toDouble()
    println(sonuc1)
    println(sonuc2)

    //2 - Sayısaldan metine dönüşüm
    var x = 85
    val sonuc3 = x.toString() //"85"
    println(sonuc3)

    //3 - Metinden sayısala dönüşüm
    val yazi = "48t"
    val sonuc4 = yazi.toIntOrNull() // toInt dediğimizde gelen sayı içerisinde hata varsa (48T gibi) hata vermek yerine null döndürmesini sağlar

    if (sonuc4 != null) {
        println(sonuc4)
    }
    else {
        println("Sonuc nulldur.")
    }




}