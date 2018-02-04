
fun main(args: Array<String>) {

    val x = 48

    //Example of basic logic test
    println(x > 10 && x < 50)

    //basic if
    if (x > 10) {
        println("x is greater than 10")
    }

    //basic if-else (complementary action)
    if (x > 100) {
        println("x is too large")
    } else {
        println("x is normal")
    }

    //if else for multiple conditions
    if (x >= 100) {
        println("x is large")
    } else if (x < 0) {
        println("x is negative")
    } else {
        println("x is below 100")
    }

    //when statement, like switch in Java
    when (x) {
        0 -> println("x is zero")
        //we can also use !in 1..100 to express its inverse
        in 1..100 -> {
            if (x % 2 == 0) {
                println("x is even")
            } else {
                println("x is odd")
            }
        }
        else -> println("x is out of range")
    }

    //decision expression example
    val y = 100
    val z = 102
    val max = if (y > z) y else z
    println("max number is $max")

    val remark = when (x) {
        in 1..99 -> "valid"
        100 -> "perfect"
        else -> "invalid"
    }
}