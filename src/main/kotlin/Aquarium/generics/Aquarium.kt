package Aquarium.generics

fun main(args: Array<String>){
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)


class TapWater : WaterSupply(needsProcessed = true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(needsProcessed = false) {}

class LakeWater : WaterSupply(needsProcessed = true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessed) {"Water supply needs processed"}

        println("adding water from $waterSupply")
    }
}

fun genericExample() {

    val aquarium: Aquarium<TapWater> = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()

    val aquarium4: Aquarium<LakeWater> = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()

}

