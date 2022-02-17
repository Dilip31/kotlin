package dilip.android.kotlinbasics


//fun main(){
//    val linda=personn("linda",42)
//    println(linda.description())
//    linda.hadbirthday()
//    println(linda.description())
//}
//
//class personn(name:String,age:Int)
//{
// **member variables**
//    val mname:String=name
//    var mage:Int=age
//
//    fun description():String{
//        return "Name:$mname,age:$mage"
//    }
//
//    fun hadbirthday(){
//        mage+=1
//    }
//
//
//}

//********** updation **********and************better way************
//fun main(){
//    val linda=personn("linda",42)
//    //default tipe of member variable is public so anyone can change the document
//    linda.mage=45
//    //for solve this problem put private before val mname and var mage
////    like
////    private val mname:String=name
////    private var mage:Int=age
//    println(linda.description())
//    linda.hadbirthday()
//    println(linda.description())
//}
//
//class personn(name:String,age:Int)
//{
//
//    val mname:String=name
//    var mage:Int=age
//
//    fun description():String{
//        return "Name:$mname,age:$mage"
//    }
//
//    fun hadbirthday(){
//        mage+=1
//    }
//}

//********** updation **********and************better way************

//fun main(){
//    val linda=personn("linda",42)
//    println(linda.description())
//    linda.hadbirthday()
//    println(linda.description())
//}
//
//class personn(private val mname:String, private var mage:Int)
//{
//
//    fun description():String{
//        return "Name:$mname,age:$mage"
//    }
//
//    fun hadbirthday(){
//        mage+=1
//    }
//
//
//}
//********** updation **********and************better way************

//fun main(){
//    val linda=personn("linda",42)
//    println(linda.description())
//    linda.hadbirthday()
//    println(linda.description())
//}
//
////prefix and sufix are not needed in kotlin
//class personn(private val name:String, private var age:Int)
//{
//
//    fun description():String{
//        return "Name:$name,age:$age"
//    }
//
//    fun hadbirthday(){
//        age+=1
//    }
//
//
//}

//********** updation **********and************better way************

fun main(){
    val linda=personn("linda",42, true)
    println(linda.description())
    linda.hadbirthday()
    println(linda.description())
}

//prefix and sufix are not needed in kotlin
class personn(private val name:String, private var age:Int,doessmile:Boolean)
{
    private val nickname: String
    init {
        val smiley=if (doessmile)"(smile)" else "(notsmile)"
        nickname="$name $smiley"
    }

    fun description():String{
        return "Name:$nickname,age:$age"

    }

    fun hadbirthday(){
        age+=1
    }


}
