fun main(args: Array<String>){
    var hour = if (args[0].toInt() < 12) "Bom dia, Kotlin" else "Boa noite, kotlin"
    print(hour)
    if (args[0].toInt() < 12) println("Good morning kotlin") else println("Good night kotlin")
    println("${if (args[0].toInt() < 12) "Good Morning kotlin" else "Good Night Kotlin"}")
}