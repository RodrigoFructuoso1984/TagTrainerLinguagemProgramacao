fun main(args: Array<String>){

    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birthday : Int) : String {
    val fortune = listOf(
        "Você terá um ótimo dia!",
        "As coisas vão correr bem para você hoje.",
        "Desfrute de um dia maravilhoso de sucesso.",
        "Seja humilde e tudo acabará bem.",
        "Hoje é um bom dia para exercitar a moderação.",
        "Acalme-se e aproveite a vida!",
        "Valorize seus amigos porque eles são sua maior fortuna.")

    var fortuneIndex = birthday % fortune.size
    //fortune[fortuneIndex]
    return when(birthday){
        1, 2, 3, 4, 5, 6, 7 -> fortune[0]
        8, 9, 10 -> fortune[1]
        11, 12 , 13 -> fortune[2]
        14, 15, -> fortune[3]
        16, 17, 18, 19, 20 -> fortune[4]
        21, 22, 23 -> fortune[5]
        28, 30 -> fortune[6]
        else -> fortune[fortuneIndex]
    }
}

fun getBirthday() : Int {
    print("\nEnter your birthday: ")

    return readLine()?.toIntOrNull() ?: 1

}