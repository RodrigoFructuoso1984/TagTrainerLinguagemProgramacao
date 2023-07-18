fun main(args: Array<String>){

    println("Lista de especiarias:")
    val spices = listOf(Spice("Canela", "mild"),
        Spice("Pimenta", "spicy"),
        Spice("Curry", "medium"),
        Spice("Cominho"))

    makeSalt()

    /*val spice = spiceList.forEach{}
    //val spice = Spice(spiceList[0].name, spiceList[0].spiciness)
    println("${spice}")*/

    val lessSpicy = spices.filter {it.heat < 3}
    val moreSpicy = spices.filter { it.heat >= 3 }

    //lessSpicy.forEach{ println("nome - ${it.name}, Nível de Picância - ${it.spiciness}, Calor - ${it.heat}") }
    //val spice = lessSpicy.forEach{}
    //println("${spice}")

    println("\nEspeciarias menos picantes:")
    for (spice in lessSpicy) {
        println("Nome: ${spice.name}, Picância: ${spice.spiciness}, Calor: ${spice.heat}")
    }

    println("\nEspeciarias mais picantes:")
    for (spice in moreSpicy) {
        println("Nome: ${spice.name}, Picância: ${spice.spiciness}, Calor: ${spice.heat}")
    }

}

class Spice (val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when(spiciness){
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                else -> 0
            }
        }

    init {
        println("Nome - ${name}, Picância - ${spiciness}, Calor - ${heat}")
    }

}

fun makeSalt() : Spice {
    return Spice("Salt", "mild")
}
