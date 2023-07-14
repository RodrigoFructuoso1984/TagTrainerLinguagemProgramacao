fun main (args: Array<String>){
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String{

  return when {
      goWalk(mood,weather) -> "go for a walk"
      isBed(mood, weather, temperature) -> "stay in bed"
      goSwimming(temperature)-> "go swimming"
      else -> "Stay home and read"
  }
}

fun goSwimming (temperature: Int) = temperature > 35

fun isBed (mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun goWalk (mood: String, weather: String) = mood == "happy" && weather == "sunny"
