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
        println("Trajeto final: ${path}")
        path.clear()
        path.add(Directions.START)
        false
    }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(command : String?) {
        if (command.equals("n")) move(north)
        else if (command.equals("s")) move(south)
        else if (command.equals("e")) move(east)
        else if (command.equals("w")) move(west)
        else move(end)
    }

}

fun main(args: Array<String>) {
    val game = Game()
    println("Trajeto inicial: ${game.path}")
    while (true) {
        print("Enter a direction - n/s/e/w ou f[encerrar]: ")
        game.makeMove(readLine())
    }


    /* println("Trajeto inicial: ${game.path}")
     game.makeMove("north")
     game.south
     game.east
     game.west
     game.end()

     println("Trajeto final: ${game.path}")*/
}

