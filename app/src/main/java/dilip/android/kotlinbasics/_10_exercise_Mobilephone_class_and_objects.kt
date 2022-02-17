package dilip.android.kotlinbasics
fun main(){
    Mobilephone("android","samsung","galaxy s20")
}
class Mobilephone constructor(osname:String,brand:String,model:String){
    init {
        println(osname)
        println(brand)
        println(model)
    }
}