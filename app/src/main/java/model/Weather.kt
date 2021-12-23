package model


data class Weather(val city:City= getDefaultCity(), val temperature:Int= -20, val feelsLike:Int=-40)

data class City(val name:String,val lat:Double, val lon:Double)

fun getDefaultCity() = City("Волгоград",48.4309,44.3006)
