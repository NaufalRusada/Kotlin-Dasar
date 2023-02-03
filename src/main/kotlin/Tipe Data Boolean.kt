import kotlin.math.E

fun main(){
    var benar = true
    var salah = false

    println(benar)
    println(salah)


/*
menentkan nilai lebih besar
*/

    fun checknilai(nilai:Int): Boolean{
        return  nilai <= 90
    }

    println(checknilai(91))
}