
fun main(args: Array<String>) {

    print("Input your name: ")
    val name = readLine()

    print("Your name is " + name)

    print("Input your age: ")
    /* Here, readLine() reads String that might be null
       To convert the input into any other type than String, we must assert that the read input has a value */
    val age = readLine()!!.toInt()

    print("Your age is " + age)
}