fun  main(){

//    val range = 1..101

// Range Terbalik
    // jika ingin menurunkan sesuai keiingin tambahkan "step" karena random dari range  kenaikan atu turun nilai 1
    val range = 100 downTo 0 step 10

    println(range)
    //contains mengetahui apakah ada angka did aalm range atau tidak dan nilainya boolean
    println(range.contains(62))
    println(range.contains(610))
    println("mendapatkan nilai awal ${range.first}")
    println("mendapatkan nilai akhir ${range.last}")
    println("Mendapatkan Total nilai di tiap kenaikan ${range.step}")
    println("Mendapatkan Total Data range ${range.count()}")


    //soal
    //1. Buatlah sebuah Range yang berisi angka 1 sampai 10, kemudian tentukan apakah angka 5 terdapat dalam Range tersebut.

    val rangesoal = 1 .. 10
    val rangesoal3 = 1 .. 10 step 2
    val rangesoal4 = 10 downTo 1
    val rangesoal5 = 'A' .. 'Z'

    if (rangesoal.contains(5)){
        println("Ada angakanya")
    } else {
        println("Tidak ada")
    }

    //2. Buatlah sebuah Range yang berisi angka 1 sampai 10, lalu tampilkan seluruh angka yang terdapat dalam Range tersebut.

    for (number in rangesoal){
        println(number)
    }

    //3. Buatlah sebuah Range yang berisi angka 1 sampai 10 dengan step 2, lalu tampilkan seluruh angka yang terdapat dalam Range tersebut.
    for (step in rangesoal3){
        println(step)
    }

    //4. Buatlah sebuah Range yang berisi angka 10 sampai 1, lalu tentukan apakah angka 5 terdapat dalam Range tersebu
    println("ada angkanya ${rangesoal4.contains(5)}")


    //5. Buatlah sebuah Range yang berisi karakter 'A' sampai 'Z', lalu tampilkan seluruh karakter yang terdapat dalam Range tersebut.
    for (alpahaber in rangesoal5){
        println(alpahaber)
    }




}