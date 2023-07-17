import java.util.Random

fun main(args: Array<String>) {

    //val rollDice = {Random().nextInt(12) + 1}
    val rollDice = { sides: Int -> if ( sides == 0 ) 0 else Random().nextInt(sides) + 1}
    val rollDice2: (Int) -> Int = { sides -> if ( sides == 0 ) 0 else Random().nextInt(sides) + 1 }
    gamePlay(rollDice2(2))
}


fun gamePlay (diceRoll: Int) {
    println(diceRoll)
}