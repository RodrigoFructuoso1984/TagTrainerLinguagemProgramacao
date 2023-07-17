fun main(args: Array<String>){
    val spiceList = listOf(Spice("Canela", "Media"),
        Spice("Pimenta", "Alta"),
        Spice("Cominho", "Baixa"),
        Spice("Cominho"))
    val spice = spiceList.forEach{}
    //val spice = Spice(spiceList[0].name, spiceList[0].spiciness)
    println("${spice}")
}

class Spice (val name: String, val spiciness: String = "mild") {

    init {
        println("nome - ${name}, Nível de Picância - ${spiciness}")
    }

    val heat: Int
        get() {return 2}

}
