package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val sonuc = 5 carp 2 //infix varken bu şekilde, eğer fonksiyon başına infix eklemezsek 5.carp(2) şeklinde yazılır
    println(sonuc)
}

//Extension : Varolan bir sınıfı genişletmek anlamına gelir
infix fun Int.carp(sayi : Int) : Int {
    return this * sayi //this(int classını temsil eder)
}