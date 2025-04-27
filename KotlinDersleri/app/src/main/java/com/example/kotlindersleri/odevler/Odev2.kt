package com.example.kotlindersleri.odevler

class Odev2 {
    val sonuc = 0

    fun fahrenheitdonusumu(derece : Int): Double {
        val sonuc = derece * 1.8 + 32
        return sonuc
    }

    fun cevrehesapla(kenar1 : Int, kenar2 : Int) : Int {
        val sonuc = (kenar1 + kenar2) * 2
        return sonuc
    }

    fun faktoriyel(sayi : Int) : Int {
        if (sayi == 1) {
            return 1
        } else {
            return sayi * (faktoriyel(sayi-1))
        }
    }

    fun aharfisayisi(kelime : String) : Int {
        val harf = 'a'
        var sayac = 0
        var kucuk_kelime = kelime.lowercase()

        for (i in kucuk_kelime) {
            if (i == harf) {
                sayac += 1
            }
        }
        return sayac
    }



}