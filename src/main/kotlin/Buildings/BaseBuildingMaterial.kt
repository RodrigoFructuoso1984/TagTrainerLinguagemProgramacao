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



