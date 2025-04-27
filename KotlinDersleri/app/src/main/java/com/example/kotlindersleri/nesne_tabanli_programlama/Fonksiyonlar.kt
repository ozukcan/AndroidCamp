package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {

    //void - sadece işlem yapan
    fun selamla1(){ //Swift -> func
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return -> Hem işlem yapan hem de değer döndüren anlamına gelir.

    fun selamla2() : String { //fun fonksiyonAdı() : geri dönecek tür
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }


    //Parametreli fonksiyon
    fun selamla3(isim : String){ //fun fonksiyonAdı(değişken : tür)
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading
    //Bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanmak

    fun topla(sayi1 : Int, sayi2 : Int) {
        println("Toplama : ${sayi1 + sayi2}")
    }

    fun topla(sayi1 : Double, sayi2 : Double) {
        println("Toplama : ${sayi1 + sayi2}")
    }

    fun topla(sayi1 : Int, sayi2 : Int, sayi3: Int) {
        println("Toplama : ${sayi1 + sayi2 + sayi3}")
    }


}