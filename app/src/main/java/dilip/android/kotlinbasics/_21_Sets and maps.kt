package dilip.android.kotlinbasics

fun main(){

    val fruits = setOf("orange","apple","mango","grabe","apple","orange")
    //repeted items are not considered
println(fruits)

    val newFruits = fruits.toMutableList()
    newFruits.add("water melon")
    newFruits.add("pear")
    println(newFruits)
    println(newFruits.elementAt(index = 4))
}