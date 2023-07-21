package Aquarium5

data class Fish(var name: String)

fun main ( args: Array<String> ) {
    fishExamples()
    /*val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    print(numbers.divisibleBy {
        it.rem(3)
    })*/
}

/*fun List<Int>.divisibleBy(lambda: (Int) -> Int): List<Int> {
    val numbers = mutableListOf<Int>()
    for (item in this){
        if (lambda(item) == 0){
            numbers.add(item)
        }
    }
    return numbers
}*/

fun fishExamples() {
    val fish = Fish("splashy")

    /*myWith (fish.name){
        println(capitalize())
    }
    println(fish.run { name })
    println(fish.apply {  })

    val fish2:Fish = Fish(name = "splashy").apply { name = "Sharky" }
    println(fish2.name)

    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })*/

    // without inline an object is created every call to myWith
    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })

    // with inline no object is created, and lambda body is inlined here
    fish.name.capitalize()
}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}