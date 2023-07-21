package Game

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    val path: MutableList<Directions> = mutableListOf(Directions.START)
    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val end = {
        path.add(Directions.END)
        println("Game over")
        println("Trajeto: ${path}")
        println("Evidência do trajeto: ${path.joinToString ( " -> " )}")
        false
    }


}

fun main(args: Array<String>) {
    val game = Game()

    println("Trajeto inicial: ${game.path}")
    game.north()
    game.south
    game.east
    game.west
    game.end()

    println("Trajeto final: ${game.path}")
}

