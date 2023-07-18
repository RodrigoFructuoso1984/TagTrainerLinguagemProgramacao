package Spices

fun main(args: Array<String>) {
    val mildCurry = Curry("Mild Curry", "mild")
    println("Curry color: ${mildCurry.color}")
    mildCurry.prepareSpice()
    mildCurry.grind()
}

abstract class Spice(val name: String, val spiciness: String = "mild", spiceColor: SpiceColor = YellowSpiceColor) : SpiceColor by spiceColor {
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor: SpiceColor {
    override val color: String = "Yellow"
}

class Curry(name: String, spiciness: String) : Spice(name, spiciness), Grinder  {
    override fun prepareSpice() {
        println("Preparing $name curry with spiciness level: $spiciness")
    }

    override fun grind() {
        println("Grinding $name curry")
    }
}