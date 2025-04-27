package com.example.kotlindersleri.standart_programlama

fun main() {
    //1,2,3
    for (i in 1..3){ //swift 1...3
        println("Dongu 1: $i")
    }

    //10 ile 20 arasında 5'er artsın

    for (x in 10..20 step 5){ //step : adım demektir 10'dan 20'ye kadar 5'er arttırırırz
        println("Dongu 2: $x")
    }


    //20 ile 10 arasında 5'er azalsın
    for (z in 20 downTo 10 step 5) {
        println("Dongu 3: $z")
    }

    //1,2,3
    var sayac = 1

    while(sayac < 3) {
        println("Dongu 4 : $sayac")
        sayac += 1
    }

    //Break ve Continue
    for (i in 1..5){
        if (i == 3) {
            break //Döngüyü durdurur.
        }
        println("Dongu 5: $i")
    }

    for (i in 1..5){
        if (i == 3) {
            break //Bulunduğu adımı pas geçer
        }
        println("Dongu 5: $i")
    }

}