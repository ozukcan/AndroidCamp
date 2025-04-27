package com.example.kotlindersleri.collections

fun main() {
    val f1 = Filmler(1,"Babam ve Oğlum", 100)
    val f2 = Filmler(2,"Neseli Hayatlar", 50)
    val f3 = Filmler(3,"Kış Uykusu", 80)

    val filmlerListesi = ArrayList<Filmler>() //Türümüz Filmler yani nesneler
    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)

    for(film in filmlerListesi) {
        println("ID : ${film.id},\nFilm Adı : ${film.ad},\nFiyat : ${film.fiyat}")
    }

    //Sıralama - Sorting

    //Artan sıralamaya Ascend - ASC
    println("-----Artan Sıralama-----")
    val siralama1 = filmlerListesi.sortedWith(compareBy{it.ad})
    for (film in siralama1)
        println("${film.id} : ${film.ad} ${film.fiyat}TL")


    //Azalan sıralamaya Descending - DESC
    println("-----Azalan Sıralama-----")
    val siralama2 = filmlerListesi.sortedWith(compareByDescending{it.ad})
    for (film in siralama2)
        println("${film.id} : ${film.ad} ${film.fiyat}TL")

    //Filtreleme
    println("-----FILTRELEME 1-----")
    val filtre1 = filmlerListesi.filter { it.fiyat > 70 && it.fiyat < 100 }
    for (film in filtre1)
        println("${film.id} : ${film.ad} ${film.fiyat}TL")

    println("-----FILTRELEME 2-----")
    val filtre2 = filmlerListesi.filter { it.ad.contains("a")}
    for (film in filtre2)
        println("${film.id} : ${film.ad} ${film.fiyat}TL")

}