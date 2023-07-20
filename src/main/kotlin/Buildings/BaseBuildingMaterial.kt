package Buildings

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}
class Brick: BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}

class Building<T: BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterilsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    val numberNeeded: Int
        get() = actualMaterilsNeeded

    fun build(){
        println("$numberNeeded ${material::class.simpleName} required!")
    }
}

fun create(){
    val wood : Building<Wood> = Building(Wood())
    wood.build()
}

fun main(args: Array<String>){
    create()
}

