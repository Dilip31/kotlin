package dilip.android.kotlinbasics

import java.lang.IllegalArgumentException

//fun main(){
//    var mycar =car()
//   println(mycar.owner)
//    println(mycar.mybrand)
//}
//
//class car(){
//  lateinit  var owner:String
//
//  val mybrand:String="BMW"
//
//  init {
//      this.owner="dilip"
//  }
//}

//we can work in kotlin without getter and setter like sown as up


//but we can use setter and getters for perform specific task

fun main(){
    var mycar =car()
//mycar.maxspeed=-5
    println(mycar.owner)
    println(mycar.mybrand)
    println(mycar.maxspeed)
//    mycar.mymodel="m8"
    //because private is just reinitialize in that class

    println(mycar.mymodel)
    //this work because just setter is private
}

class car(){
    lateinit  var owner:String

    val mybrand:String="BMW"
get(){
    return field.toLowerCase()
}

    var maxspeed =254

    set(value){
        field= if(value > 0) value else  throw IllegalArgumentException("maxspeed can not be less than 0")
    }

     var mymodel="m4"
    private set

    init {
        this.owner="dilip"
    }
}