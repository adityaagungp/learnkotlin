
fun main(array: Array<String>) {

    val name: String
    name = "Budi Sariana Budhi"

    println("Name: $name")
    println("First char: " + name[0]) //for this, cannot use string interpolation
    println("Name: " + name.toUpperCase())

    //Split string into [String]
    val names = name.split(" ")
    println(names)
}