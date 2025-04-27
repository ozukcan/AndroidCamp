package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nullable, Null Safety, Optional(Swift)
    //Genellikle mobil uygulama geliştirme dillerinde kullanılır.

    //1. Tanımlama ? ile yapılır
    var mesaj : String? = null
    //mesaj = "Merhaba"

    //Yöntem 1
    //Sorun yoksa çalışır, sorun varsa uygulama çökmez
    println("Yöntem 1 : ${mesaj?.uppercase()}")

    //Yöntem 2
    //Sorun yoksa çalışır, sorun varas uygulama çöker
    //Çok emin olduğunuz uygulamalarda kullanabilirsiniz
    //println("Yöntem 2 : ${mesaj!!.uppercase()}") //mesaj değişkeninin ataması yapılmadığı sürece hata verir.

    //Yöntem 3
    //null kontrolü

    if(mesaj != null) {
        println("Yöntem 3 : ${mesaj.uppercase()}")
    } else {
        println("Değişkende null yer almaktadır")
    }

    //Farklı bir null kontrolü yapmak istersek (if kontrolü)
    mesaj?.let{
        println("Yöntem 4 : ${mesaj.uppercase()}")
    }


}