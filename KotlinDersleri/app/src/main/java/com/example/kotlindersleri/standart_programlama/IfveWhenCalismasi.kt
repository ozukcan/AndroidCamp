package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 19

    println(yas >= 18) //println(koşul) sonucu true veya false döndürür.

    if(yas >= 18) { //if bloğu bir koşulu sorgulamamıza ve o sorgunun sonucuna göre aksiyon almamıza olanak sağlar
        println("Resitsin")
    } else {
        println("Resit degilsin")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if (ka == "admin" && s == 123456) { // "&&" ifadesi mantıksal ifadelerde AND/VE anlamına gelir iki koşulun da doğru olduğu durumda true döndürür.
        println("Hosgeldin")
    } else {
        println("Hatalı giriş")
    }

    if(sayi == 9 || sayi == 10) {
        println("sayi 9 veya 10'dur")
    } else {
        println("sayi 9 veya 10'degildir")
    }
    //When

    val number = 1
    when(number) {
        1 -> println("Sayı 1'dir")
        2 -> println("Sayı 2'dir")
        else -> println("Tanımlanmayan sayı")
    }

}