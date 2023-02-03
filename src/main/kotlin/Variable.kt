fun main(){
    var name: String? = null
    name = "nopal"
    val age = 26


    var fullname: String? = null
    fullname = "Naufal Rusada"

    println(fullname?.length)

    if (name != null) {
        println("Name: " + name)
    } else {
        println("Name is null")
    }

}