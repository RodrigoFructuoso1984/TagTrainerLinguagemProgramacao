
fun main(args: Array<String>){
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.nameSpice} ${simpleSpice.spiciness}")
}
class SimpleSpice {
    var nameSpice: String = "curry"
    var spiciness: String = "mild"

    val heat: Int
        get() {return 5}
}