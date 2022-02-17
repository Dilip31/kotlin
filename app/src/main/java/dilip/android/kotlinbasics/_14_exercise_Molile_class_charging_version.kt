package dilip.android.kotlinbasics
fun main(){


    val galaxys20 =Mobilephone1("android","samsung","galaxy s20")
    val relme5pro =Mobilephone1("android","samsung","galaxy s20")
    val iphone12 =Mobilephone1("android","samsung","galaxy s20")

    println(galaxys20.battery)
    println(galaxys20.chargeBattery(40))
}
class Mobilephone1 constructor(osname:String,brand:String,model:String){

    var battery:Int=30

    init {
        println("the phone $model from $brand uses $osname as its operating system")
    }

    fun chargeBattery(charged:Int){
        println("battery had before is:${this.battery}")
        println("battery is charged:$charged")
        println("battery is :${battery + charged}")


    }


}