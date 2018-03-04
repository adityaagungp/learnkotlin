class Person(var name: String, var age: Int)

fun main(args: Array<String>) {

    //Filter example
    //Simple data type
    val numbers = listOf(2, 5, 9, 10, 11, 13)
    val even = numbers.filter { it % 2 == 0 }
    println(even)

    //Object filtering
    val people = listOf(
            Person("Abdul", 22),
            Person("Budi", 71),
            Person("Cici", 45),
            Person("Dede", 12),
            Person("Evi", 41)
    )
    val youngster = people.filter { it.age < 25 }
    for (person in youngster) {
        println(person.name)
    }

    //Map function
    val squared = numbers.map { it * it }
    print(squared)
}