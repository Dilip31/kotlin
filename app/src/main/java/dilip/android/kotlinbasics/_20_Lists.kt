package dilip.android.kotlinbasics

fun main(){
    val months = listOf("january","february","march")
    val anytype= listOf(1,2,3,true,false,"string")

    println(anytype.size)
    println(months[1])

    val additionalMonths = months.toMutableList()
    val newmonths = arrayOf("April","May","june")

    additionalMonths.addAll(newmonths)
    additionalMonths.add("july")
    println(additionalMonths)

    val days = mutableListOf<String>("mon","tue","wed")
    days.add("thu")
    days[2]="sunday"
    println(days)
    days.removeAt(1)

    val removeList= mutableListOf<String>("mon","wed")
    days.removeAll(removeList)
    println(days)
    days.removeAll(days)
    println(days)
}