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

fun <T: BaseBuildingMaterial> isSmallbuilding(building: Building<T>) {
    if(building.actualMaterilsNeeded < 500) {
        println("pequeno edifício")
    } else {
        println("grande edifício")
    }
}

fun create(){
    //val wood : Building<Wood> = Building(Wood())
    //wood.build()
    val building = Building(Wood())
    isSmallbuilding(building)
}

fun main(args: Array<String>){
    create()
}

