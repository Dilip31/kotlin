package dilip.android.kotlinbasics

fun main(){
//    In Kotlin you can use if statement as an expression, for example, you can assign the result of if-else to a variable. Let's look at an example

//create a variable for testing all condition
    val age = 16
//create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 16

//Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        println("You may vote now")
//return the value for this block
        votingAge
    }else if (age>=drivingAge){
        println("You may drive now")
//return the value for this block
        drivingAge
    }else{
        println("You are too young")
//return the value for this block
        age
    }
//print the age for the passing condition
    print("current age is $currentAge")
//    Now when we run with the value of age as 16, it prints
//
//    You may drive now current age is 16
//
//    When we run with a value of age as 22, it prints
//
//    Now you may drink in the US current age is 21
//
//    So it actually prints the passing block with the equivalent age.

    val x : Any = 13.37
//assign when to a variable
    val result =  when(x) {
//let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
//then print x with the result
    print("$x $result")
}