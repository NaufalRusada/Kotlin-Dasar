import jdk.internal.util.xml.impl.Input
import java.util.Scanner

fun main(){
    val result =  10/2
    println(result)

    val result2 = 1.0 - 5.0* 2.0 / 3
    println(result2)

    val result3 = 7931 % 7 // 1133 * 7 = 7931 ->  7931 - 7931 = 0
    println(result3)

    val result4 = 20 % 7 // 7 * 2 = 14 -> 20 - 14 = 6
    println(result4)

    //cara mennetukan bilangan ganjil
    val angka = 1..10

    for ( urut in angka ){
        if (urut % 2 == 0){
            println("genap ${urut}")
        } else {
            println("ganjil${urut}")
        }
    }


    val scanner = Scanner(System.`in`)
    print("Masukkan Nilai")
    val input = scanner.nextInt()


    if (input % 2 == 0){
        println("genap")
    } else {
        println("ganjil")
    }






}