package dilip.android.kotlinbasics

fun main(){

    person("dilip","khunti")

}

class person (firstname:String ,lastname:String)
//class person (firstname:String="jone" ,lastname:String="don")
//if we call function without passing string
//person so default value is jone and don


{
    //intializer block
    init {
     println("person created ")
        println("first name is $firstname and last name is $lastname")

    }
    //if we call function like person(lastname="hello")
//and run code so print
    //person created
    //first name is jone and last name is hello

    //class Perso constructor(_firstName: String, _lastName: String) { // or class Person constructor    (_firstName: String, _lastName: String)
//    // Member Variables (Properties) of the class
//    var firstName: String
//    var lastName: String
//
//    // Initializer Block
//    init {
//        this.firstName = _firstName
//        this.lastName = _lastName
//
//        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
//    }
//}

// create an object like so:
// val denis = Person("Denis", "Panjuta")

// Alternatively:
//class Perso (_firstName: String, _lastName: String) {
//    // Member Variables (Properties) of the class
//    var firstName: String = _firstName
//    var lastName: String = _lastName
//
//    // Initializer Block
//    init {
//        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
//    }
//}
    // Alternatively:
//class Perso(var firstName: String, var lastName: String) {
//    // Initializer Block
//    init {
//        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
//    }
//}

// Or even:
// whereby John and Doe will be default values
//class Perso(var firstName: String = "John", var lastName: String= "Doe") {
//    // Initializer Block
//    init {
//        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
//    }
//}


}