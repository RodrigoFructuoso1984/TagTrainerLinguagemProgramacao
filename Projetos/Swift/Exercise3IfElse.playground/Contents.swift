var clima = "cloudy"
func statusWeather(weather: String){
    if weather == "sunny" {
        print("ensolarado")
    } else if weather == "rainy" {
        print("chuvoso")
    } else if weather == "cloudy" {
        print("nublado")
    }
}

statusWeather(weather: clima)
