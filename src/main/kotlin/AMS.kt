import java.util.Random

fun main (args: Array<String>) {
    println("Hello, ${args[0]}!")
    feedTheFish()
    eagerExample()

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }

    // repeat (function from standard library)
    repeat(2) {
        println("A fish swimming")
    }
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "aligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    // apply filter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p'  }
    println(filtered)
    println(filtered.toList())

    // apply map lazily
    val lazyMap = decorations.asSequence().map {
        println("map: $it")
    }

    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")

}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20 , 50 )
    shouldChangeWater(day)
    shouldChangeWater(day, dirty=50)
    shouldChangeWater(day = "Monday")

    if (shouldChangeWater(day)){
        println("Change the water today")
    }

    //call dirty processor
    dirtyProcessor()
}

fun swin() {
    // swin!
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20) : Boolean {

    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

var dirty = 20

val walterFilter: (Int) -> Int = { dirty -> dirty / 2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, walterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty, { dirty ->
        dirty + 50
    })
}

fun isTooHot (temperature: Int) = temperature > 30
fun isDirty (dirty: Int) = dirty > 30
fun isSunday (day: String) = day == "Sunday"




fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean{
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}