package dilip.android.kotlinbasics


fun main(){

//    val number:IntArray = intArrayOf(1,2,3,4,5,6)

//    val number = intArrayOf(1,2,3,4,5,6)

    val number = arrayOf(1,2,3,4,5,6)

    println(number.contentToString())

    for (element in number){
        print(element)
    }

    println(number[1])

//    for changing the values in array

    number[0]=6
    number[1]=5
    println(number.contentToString())

    val days= arrayOf("sun","mon","thues","wed","thurs","fri","sat")

    val fruits= arrayOf(fruit("Apple",2.5),fruit("grape",3.5))
    println(fruits.contentToString())

    for (fruit in fruits)
    {
        println("${ fruit.name }")
    }

    for (index in fruits.indices)
    {
        println("${fruits[index].name} is in index $index")
    }


//    **** power of array of *****story****non similar datatypes

    val mix= arrayOf("sun","mon",1,3,fruit("Apple",2.5),"thurs","sat")
    println(mix.contentToString())
}

data class fruit(val name:String,val price:Double)
