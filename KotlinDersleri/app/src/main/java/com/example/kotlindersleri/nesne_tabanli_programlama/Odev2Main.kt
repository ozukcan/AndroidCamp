package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Odev2()
    val uzun_kenar = 10
    val kisa_kenar = 4
    val kelime = "MAkara"
    val derece = 30
    val faktoriyel = 5


    var donustur = f.fahrenheitdonusumu(derece)
    var cevre_hesapla = f.cevrehesapla(uzun_kenar,kisa_kenar)
    var faktoriyel_sonuc = f.faktoriyel(faktoriyel)
    var harf_sayisi = f.aharfisayisi(kelime)

    println("$derece celcius =  $donustur fahrenheit.")
    println("Uzun kenarı : $uzun_kenar, kısa kenarı : $kisa_kenar olan dikdörtgenin çevresi : $cevre_hesapla")
    println("Parametre olarak girilen $faktoriyel sayısının faktoriyeli : $faktoriyel_sonuc")
    println("$kelime içerisindeki a harfi sayısı : $harf_sayisi")

}