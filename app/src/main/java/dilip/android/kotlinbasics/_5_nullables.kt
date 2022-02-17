package dilip.android.kotlinbasics

fun main() {
    var name: String = "dilip"
//    name = null -->compillation error

    var nullablename: String? = "dilip"
//    nullablename = null

    var len = name.length
//    var len2=nullablename.length
//    name = null -->compillation error

//    *********old phashion method************
//    if (nullablename != null) {
//var len2=nullablename.length
//    }else{
//         null
//    }

//    or
        var len2=nullablename?.length

    println(nullablename?.toLowerCase())
//jo string null na hoy toj tolowecase method chale

//    short technic like if
    nullablename?.let { println(it.length) }

}

