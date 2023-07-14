fun main (args: Array<String>){
    println(whatShouldIDoToday("bad"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String{
  //val activity =
  return when {
      mood == "happy" && weather == "sunny" -> "go for a walk"
      else -> "Stay home and read"
  }
}