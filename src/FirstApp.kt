/* This is example of hello world app in Kotlin.
   The app just print "Welcome to Kotlin"*/

fun main(args: Array<String>) {
    print("Welcome to ")
    println("Kotlin") //example of short comment

    //Let's try to define some variables
    val i = 5
    val i2: Int = 10 //assign variable with its type. Providing its data type is unnecessary though, because we already assign its initial value.
    var name: String
    val age: Int? //this variable can accept null value and is assigned once

    //This assignment can't be done since i was declared as immutable value (using val)
    //i = 7

    //This assignment can't be done because name variable must have real value
    //name = null
    name = "Budiono" //Here name is mutable String

    println(i)
    println(i2)
    println(name)

    age = 20
    println(age) //This line will cause error if age is unassigned by any value
}