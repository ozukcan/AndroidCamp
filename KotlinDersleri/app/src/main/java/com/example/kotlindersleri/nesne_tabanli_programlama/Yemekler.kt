package com.example.kotlindersleri.nesne_tabanli_programlama

data class Yemekler(var id:Int, var ad:String, var fiyat:Double) {
    //Constructor - init fonksiyonu
    //Bu sınıftan nesne oluştuğunda çalışsın.

    init {
        println("****** Nesne oluştu ******")
    }

    fun bilgiAl(){
        println("-------------------------------")
        println("Id : ${id}")
        println("Ad : ${ad}")
        println("Fiyat : ${fiyat}")
        println("-------------------------------")
    }

    //this : Bulunduğu sınıfı temsil eder
    //super : Kalıtım ile bir üst sınıfı temsil eder
    //data : class kısmının başına yazılır, genellikle veri tabanıyla çalışacağımız zaman kullanılır.

}