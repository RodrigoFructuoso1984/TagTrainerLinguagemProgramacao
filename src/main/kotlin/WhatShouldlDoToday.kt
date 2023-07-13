fun main (args: Array<String>){
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String{
  val activity =  when {
            mood == "happy" && weather == "sunny" -> "go for a walk"
            else -> "Stay home and read"
  }
  return activity
}