package dilip.android.kotlinbasics

data class  user(val id:Long,var name:String)

fun main(){
    val user1=user(1,"dilip")

    val name=user1.name
    println(name)
    user1.name="Michel"
    val user2=user(1,"Michel")

    println(user1.equals(user2))
//or
    println(user1==user2)

    println("user detlils: $user1")
    println("user detlils: $user2")

    val updateduser=user1.copy(name="dilip khunti")
    println(updateduser)

    println(updateduser.component1())//print 1

//    **********

    val (id,mame)=updateduser

    println("id is :$id")
    println("name is :$mame")
}