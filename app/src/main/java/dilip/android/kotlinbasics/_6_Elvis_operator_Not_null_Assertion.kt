package dilip.android.kotlinbasics

fun main(){
    var nullablename: String? = "Dilip"

    var name =nullablename ?: "Guest"
    //jo nullablename ma name hoy to e name ma jay baki default guest
    println("name is $name")
    //?: is alvis operator

    println(nullablename!!.toLowerCase())

    //it converts averithing into lowercase

}