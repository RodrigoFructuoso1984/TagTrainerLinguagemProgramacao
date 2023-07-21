package Game
import kotlin.math.absoluteValue

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Location (val width: Int = 4, val heigth: Int = 4){

    val map = Array(width) { arrayOfNulls<String>(heigth) }

    var currentLocation = Pair (0,0)

    fun updateLocation(direction: Directions) {

        if(direction.equals(Directions.NORTH)) {
            currentLocation = Pair(currentLocation.first, (currentLocation.second + 1).rem(heigth))}
        else if(direction.equals(Directions.SOUTH)) {
            currentLocation = Pair(currentLocation.first, (currentLocation.second - 1).absoluteValue.rem(heigth))}
        else if(direction.equals(Directions.EAST)) {
            currentLocation = Pair((currentLocation.first + 1).rem(width), currentLocation.second)}
        else if(direction.equals(Directions.WEST)) {
            currentLocation = Pair((currentLocation.first - 1).absoluteValue.rem(width), currentLocation.second)}
    }

    fun getDescription ():String? {
        return map[currentLocation.first.rem(width)][currentLocation.second.rem(heigth)]
    }
    init {
        for (x in 0 until width){
            for (y in 0 until heigth){
                map[x][y] = "Localização $x - $y"
            }
        }
    }

}


class Game {
    val path: MutableList<Directions> = mutableListOf(Directions.START)
    val map = Location()

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

    fun makeMove(direction: String?) {
        if (direction.equals("n"))  { move(north); map.updateLocation(Directions.NORTH) }
        else if (direction.equals("s")) { move(south); map.updateLocation(Directions.SOUTH) }
        else if (direction.equals("e")) { move(east); map.updateLocation(Directions.EAST) }
        else if (direction.equals("w")) { move(west); map.updateLocation(Directions.WEST) }
        else move(end)
    }

}

fun main(args: Array<String>) {
    val game = Game()
    println("Trajeto inicial: ${game.path}")
    while (true) {
        print("Enter a direction - n/s/e/w ou f[encerrar]: ")
        game.makeMove(readLine())
        println(game.map.getDescription())
    }


    /* println("Trajeto inicial: ${game.path}")
     game.makeMove("north")
     game.south
     game.east
     game.west
     game.end()

     println("Trajeto final: ${game.path}")*/
}

