package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    //returnm
    val gelenSonuc = f.selamla2()
    println("Gelen sonuç : $gelenSonuc")

    //parametre
    f.selamla3("Zeynep")

    //Overloading
    f.topla(10,20)
    f.topla(10.90,20.82)
    f.topla(10,20,30)

}