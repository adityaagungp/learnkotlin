
//example of a function
fun isEven(i: Int): Boolean {
    return i % 2 == 0
}

//function with default parameter value
fun sum(a: Int, b: Int = 0): Int {
    val c = a + b
    return c
}

//function overload
fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

//function polymorphism
fun sum(a: Double, b: Double): Double {
    return a + b
}

//method: function which return nothing, just do a routine
fun printNTimes(n: Int) {
    for (i in 1..n) {
        println("Hello")
    }
}

fun main(args: Array<String>) {
    println(isEven(88))

    val sum1 = sum(5, 6)
    println(sum1)
    val sum2 = sum(9) //didn't assign b value
    println(sum2)
    val sum3 = sum(3, 4, 5) //call overloaded function
    println(sum3)
    val sum4 = sum(3.14, 2.22)
    println(sum4)

    //call a method
    printNTimes(10)
}