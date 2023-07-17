package Aquarium

fun main (args: Array<String>) {
    buildAquarium()

}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println( "Length: ${myAquarium.length} " +
             "Width: ${myAquarium.width} " +
             "Height: ${myAquarium.height}"
    )

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, height = 15, width = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
            "Length ${myAquarium2.length} " +
            "Width ${myAquarium2.width} " +
            "height ${myAquarium2.height} "
    )

}